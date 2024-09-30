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

