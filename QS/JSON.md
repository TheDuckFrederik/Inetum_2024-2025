A .[[JSON]] file is used to store data in a similar manner to an .[[XML]] file. This is an example that I made to try and do a .[[JSON]].
```
{
    "firstName": "Unai",
    "lastName": "Pujol",
    "gender": "Apache Helicopter",
    "age": "17",
    "adress": {
        "streetAdress": "Carrer Judjats, 10",
        "city": "Reus",
        "province": "Tarragona",
        "postalCode": "43205"
    },
    "phoneNumbers": [
        {"type": "home", "number": "640744237"}

    ]

}
```
Now the key is to try to make one for the [[Non-relational database]] , so that it can then be imported to [[MongoDB]]. Now Kevin helped us out make the .[[JSON]] and try to understand something.
```
{
    "Posts": {
        "Plates": {
            "Name": "string",
            "Description": "string",
            "History": "string",
            "Recipe": {
                "Ingredients": "string",
                "How to": "string"
            }
        },
        "User": {
            "Avatar": "string"
        }
    },
    "User": {
        "FirstName": "string",
        "LastName": "string",
        "E-mail": "string",
        "Avatar": "string",
        "Password": "string"
    }
}
```
