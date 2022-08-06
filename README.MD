# GenShin Character Repository


### Create Character
```bash

curl -X -H 'Content-Type: application/json' POST localhost:8080/characters -d '
{  
  "lastName" : "Chiu",
  "firstName" : "Felix", 
  "displayName" : "DaVader" 
}
'
```

### Update Character
```bash

curl -X -H 'Content-Type: application/json' POST localhost:8080/characters -d '
{ 
  "id" : 1, 
  "lastName" : "Chiu",
  "firstName" : "Felix", 
  "displayName" : "DaVader" 
}
'
```