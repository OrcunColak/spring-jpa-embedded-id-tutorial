# Read Me First

The original idea is from  
https://beratyesbek.medium.com/hibernate-inheritance-composite-pk-037ac0f63962

@EmbeddedId causes schema SQL to be something like

```
primary key (first_name, last_name)
```

