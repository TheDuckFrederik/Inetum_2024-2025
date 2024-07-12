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
Now the key is to try to make one for the [[Non-relational database]] on our [[First App]] project, so that it can then be imported to [[MongoDB]]. Now Kevin helped us out make the .[[JSON]] and try to understand something.
```
{
    "Posts": {
        "Country": "string"
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
"Posts" is what the user sees, so the countries, plates, info about the plate, their user avatar, etc. Then the "User" is for the data of the user when they sign up.
We think it's like that, but Kevin asked ChatGPT and got this:
```
{  
  "Posts": [  
    {  
      "Country": "string",  
      "Plates": [  
        {  
          "Name": "string",  
          "Description": "string",  
          "History": "string",  
          "Recipie": {  
            "ingredientes": ["ingrediente1", "ingrediente2"],  
            "preparacion": "string"  
          }  
        }  
      ],  
      "user": {  
        "avatar": "string"  
      }  
    }  
  ],  
  "Users": [  
    {  
      "name": "string",  
      "apellidos": {  
        "primero": "string",  
        "segundo": "string"  
      },  
      "email": "string",  
      "avatar": "string",  
      "password": "string"  
    }  
  ]  
}
```
But we have to at least try API rest because the web doesen't work well with web scraping.
#finish 