# API Testing


## What is Client & Server
**A client** is computer hardware device or software that accesses a service made available by a server.The server is more often (but not always) located on a seperate physical computer.

**A server** is physical computer dedicated to services to serve the need of other computers.Depending on the service that is running, it could be a file server, database server, home media server, print server or web server.


### 1 tier
we have single system, where client & server in same machine is comes under 1 tier architecture.

### 2 Tier
We have multiple client, but they are accessing single database server which is located on different server.

### 3 tier
Presenation layer

Application layer

Data Layer

### Application Programing Interface (API)
is way to communication between two application where appliation may differ in their platform or in tern of technology

[ Front End of the application]

[Middle Layer (API Layer)]
- This is responsiblity of mid layer to take the data from frontend and insert into the backend
- This is responsiblity of mid layer to fetch the data from backend and dispay on the fronend

[Backend Layer]

*** API is way to communication between two layer.


API
- SOAP
- REST

difference between API & Webservice


REST API method
GET
PUT
POST
DELETE

http VS Https



# 2

POSTMAN - API Testing tool
we can do the api testing by using postman

Desktop/web
Workspace - Area we maintain the files and Saved
Workspace - create workspace, rename, delete

creating ccollection - contains number of folders and http request
create, rename, delete , run the collection
we can create a N number of collection under the  workspace

request------>API -------->Response

HTTP request
--------------------------
GET -- retrive the resourse from the database
PUT -- update existing resourse on the database
POST -- create resourse on database
PATCH -- update partial details on the resourse
DELETE -- dlete existing resourse from the database

Sample API:
-------------
https://reqres.in/api/users?page=2

Validation
----------
Status code
Time
size data
response body (JSON/XML)
cookies
headers

HTTP status code
----------------------
3 Level

200
400
500


# 3

Create your own API's
1) NodeJs
 npm -node package manager
  node --version
  npm --version
  npm -node package manager

2) json-server
   run the below command in the runtime/terminal
   npm install -g json-server

JSON - JavaScript object Notation

Create a json 
```json
{
    "student": [
        {
            "id": 1,
            "name": "John",
            "location": "India",
            "phone": "1234567890",
            "course": [
                "Java",
                "Selenium"
            ]
        },
        {
            "id": 2,
            "name": "Emily",
            "location": "USA",
            "phone": "9876543210",
            "course": [
                "Python",
                "Data Science"
            ]
        },
        {
            "id": 3,
            "name": "Michael",
            "location": "Canada",
            "phone": "5551234567",
            "course": [
                "JavaScript",
                "React"
            ]
        },
        {
            "id": 4,
            "name": "Sophia",
            "location": "Australia",
            "phone": "4449876543",
            "course": [
                "DevOps",
                "AWS"
            ]
        },
        {
            "id": 5,
            "name": "Liam",
            "location": "UK",
            "phone": "2223334445",
            "course": [
                "C++",
                "Machine Learning"
            ]
        }
    ]
}
```
go to the path -- cmd 
enter {path} json-server $fileName$.json

Postman API

1. GET  - All student data |   http://localhost:3000/student
2. GET -  get student data for id=1 | http://localhost:3000/student?id=1
3. POST - create a new student data
  ```json 
   {
    "name": "Ram",
    "location": "Sharma",
    "phone": "9037282",
    "course": [
        "Java",
        "Angular"
    ]
}
```
POST - URL :  http://localhost:3000/student | body-->raw -->json 

4.PUT - http://localhost:3000/student?id=5 
5. DELETE - http://localhost:3000/student?id=5 



# JSON

- JSON - JavaScript Object Notation
- json is syntax for storing and exchanging data
- Basically it was designed for human-readable data exchange
- JSON is text, Written with java script object notation
- It has been extended from the javascript scripting language
- json internet media type is application/json

DATA TYPE
1. Number
2. Boolean
3. String
4. Null
5. Object
6. Array

Data Will be represented Key & value
key is always included in quotation
curly braces should hold the object
square braket hold arrays

e.g. 
{
 "Name" : "John"
}


Comparison JSON & XML

JSON Array

 - json array reprents order list of value
 - json array can store multiple values. It can store string, Number, boolean or object in JSON array
 - In JSON Array, value must be seperated by comma
 - The  [square bracket ] represent the json array


# 4

Assetion - Validation point
- Status code
- Header
- Cookies
- Response time
- Response body
  
PM- library - Function/Assertion provided

Normal Function - 
Arrow Function - 

# Testing the status code
Test for the  response status code
```
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.equal(200);
});
```
if you want to test for the status code being one of a set, include them all in an array use one of 
```
pm.test("successful POST request", ()=> {
    pm.expect(pm.response.code).to.be.oneOf([200, 201]);
});
```
Check the status code text
```
pm.test("status code name has a string", ()=> {
    pm.response.to.have.status("Created");
});
```
