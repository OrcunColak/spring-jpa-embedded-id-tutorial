# Read Me First

The original idea is from  
https://beratyesbek.medium.com/hibernate-inheritance-composite-pk-037ac0f63962

# @EmbeddedId Rules

it must be public
it must implement the Serializable interface
it must have a no-arg constructor
it must define the equals() and hashCode() methods

@EmbeddedId causes schema SQL to be something like

```
primary key (first_name, last_name)
```

# JPQL

If we have an entity as below

```
@Embeddable
@NoArgsConstructor
@Getter
public class OrderPK implements Serializable {
 private int id;
 private String type;

 @Override
 public boolean equals(Object o) {
  ...
 }

 @Override
 public int hashCode() {
  ...
 }
}

@Entity
@Table(name = "orders")
@Data
public class Order {
 @EmbeddedId
 private OrderPK orderPK;
 ...
}
```

JPQL should be something like, we need to do one extra traversal:

```
SELECT o FROM Order o WHERE o.orderPK.id = :orderId AND o.orderPK.type = :orderType
```