# API Testing [Manual]

# 1. Chapter 1

**API Testing** is a type of software testing that involves testing application programming interfaces (APIs) directly. It focuses on verifying the functionality, reliability, performance, and security of the APIs, ensuring that they meet the expected behaviors and requirements.

In API testing, rather than testing the graphical user interface (GUI), the tester sends requests to the API, receives responses, and verifies the data, status codes, error handling, and time efficiency of the API. API testing is crucial because APIs serve as the communication layer between different software systems.

Key aspects of API testing include:
- **Validation of Response Data:** Ensuring the API returns the correct data and in the expected format (e.g., JSON, XML).
- **HTTP Status Codes:** Checking if the API returns the correct status codes (e.g., 200 OK, 404 Not Found, 500 Internal Server Error).
- **Error Handling:** Ensuring proper error messages and codes are returned when incorrect or invalid data is sent.
- **Performance:** Measuring the response times of the API under various conditions, including load testing.
- **Security:** Verifying that the API is secure, particularly for authentication, authorization, and data encryption.


## What is Client & Server
**A client** is computer hardware device or software that accesses a service made available by a server.The server is more often (but not always) located on a seperate physical computer.

**A server** is physical computer dedicated to services to serve the need of other computers.Depending on the service that is running, it could be a file server, database server, home media server, print server or web server.

### Architecture Tiers:

### 1-Tier Architecture:
- The client and server exist on the same machine.
- The application, database, and user interface are all managed by one system.
- Example: A personal computer running both a local application and its database.

### 2-Tier Architecture:
- There are multiple clients accessing a single server, typically a database server.
- The client handles the presentation layer (user interface), while the server manages the data.
- Example: A desktop application (client) that connects to a remote database server.

### 3-Tier Architecture:
- The system is divided into three layers:
   - Presentation Layer: The user interface where users interact with the application (e.g., web browsers or GUI applications).
   - Application Layer (Logic Layer): Processes the business logic and handles the communication between the presentation layer and data layer.
   - Data Layer: Manages data storage, retrieval, and database operations.
- This separation allows for better scalability, flexibility, and manageability.


### Application Programming Interface (API):
An API is a method of communication between two software applications. These applications can vary in terms of platform or technology, yet APIs enable them to communicate with each other. APIs act as a bridge between different layers or systems.

- Front End: The user-facing part of an application, often known as the presentation layer.
- Middle Layer (API Layer): The API acts as a mediator between the front end and the backend, responsible for:
   - Taking data from the frontend and inserting it into the backend.
   - Fetching data from the backend and displaying it on the frontend.
- Backend Layer: The part of the system that stores data and handles the business logic.

**API as a Communication Layer:**
An API facilitates communication between two layers of an application. For example, when a user submits a form on a website (frontend), the API processes that request and sends the data to the backend. It also retrieves information from the backend and displays it on the frontend.

**Types of APIs:**
1. SOAP (Simple Object Access Protocol):
  - A protocol that uses XML to facilitate communication between systems.
  - More structured and standardized, commonly used in enterprise-level applications.
2. REST (Representational State Transfer):
  - A more flexible and simpler alternative to SOAP.
  - Uses standard web protocols (HTTP) and formats like JSON or XML for communication.

**Difference Between API and Web Service:**
**API:** A general term that refers to a set of rules and tools that allow applications to interact with each other. APIs can be exposed over different communication protocols.
**Web Service:** A type of API that is specifically designed for web-based interaction. All web services are APIs, but not all APIs are web services.

REST API Methods:
- GET: Retrieve data from a server (e.g., fetch user details).
- POST: Send data to a server to create a new resource (e.g., create a new user).
- PUT: Update an existing resource on a server (e.g., update user details).
- DELETE: Remove a resource from a server (e.g., delete a user).

**HTTP vs. HTTPS:**
- HTTP (Hypertext Transfer Protocol): A protocol for transferring data between a client and server. Communication is not encrypted, making it less secure.
- HTTPS (HTTP Secure): The secure version of HTTP. It uses encryption (SSL/TLS) to protect data during transmission, providing confidentiality and data integrity.

**URI (Uniform Resource Identifier):**
A URI is a general term used to identify or locate a resource on the internet. It can refer to either a URL or a URN. The purpose of a URI is to distinguish or reference a resource, whether by its name, location, or both.

A URI can be categorized into:
- URL (Uniform Resource Locator)
- URN (Uniform Resource Name)

Example:
- `http://example.com/page` is a URI (and specifically a URL).
- `urn:isbn:978-3-16-148410-0` is also a URI (and specifically a URN).

**URL (Uniform Resource Locator):**
A URL is a type of URI that specifies the location of a resource on the internet. It typically provides the means to access the resource by indicating its network location (via protocols like http, ftp, etc.).

Components of a URL:
- Protocol: The scheme (e.g., http, https, ftp) used to access the resource.
- Domain: The host or server where the resource is located (e.g., example.com).
- Path: The specific location or directory of the resource on the server (e.g., /page).

Example:
- `https://www.example.com/index.html` [ Protocol: https ], [ Domain: www.example.com ] & [ Path: /index.html ]

**URN (Uniform Resource Name):**
A URN is a type of URI that names a resource uniquely without pointing to its location. It is used to identify a resource by name, independent of its location or how to access it. URNs are often used in systems that need a persistent identifier for resources, even if the location or details change over time.

Example:
`urn:isbn:978-3-16-148410-0`
This is a URN for a book identified by its ISBN number. It names the resource but doesn’t tell you where to find it.

**Key Differences:**
1. URI: A broad category that includes both URLs and URNs.
2. URL: A type of URI that specifies where a resource is located and how to retrieve it.
3. URN: A type of URI that identifies a resource by name, without specifying its location.

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
# Testing the API
## Testing the status code
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
## Testing the Header

Check that the response header is present
```
pm.test("Content-Type header is present", ()=> {
    pm.response.to.have.header("Content-Type");
});
```
Test for a response header having a particular value:
```
pm.test("Content-Type header is application/json", () => { pm.expect (pm. response.headers.get('Content- Type')).to.eql ('application/json; charset=utf-8');
});
```

## Testing cookies
Test if a cookie is present in the response:
```
pm.test("Cookie 'language' is present", () => { pm.expect (pm.cookies. has ('language')).to.be.true;
});
```

Test for a particular cookie value:
```
pm.test("Cookie language has value 1", () => { pm.expect(pm.cookies.get('language')).to.eql('en-gb');
});
```
## Testing response times

Test for the response time to be within a specified range:
```
pm.test("Response time is less than 200ms", () => { pm.expect(pm. response.responseTime).to.be.below (200);
});
```
## Asserting a value type
Test the type of any part of the response:
```
{
  "id": 1,
  "name": "John",
  "location": "india",
  "phone": "1234567890",
  "courses": [        
           "Java",
           "Selenium"
             ]
}
```

```
const jsonData = pm. response.json ();
pm. test ("Test data type of the response", () => {
     pm.expect(jsonData). to.be.an ("object");
     pm.expect(jsonData.name).to.be.a ("string");
     pm.expect(jsonData.id).to.be.a("number");
     pm.expect(jsonData.courses).to.be.an ("array");
});
```

## Asserting array properties
Check if an array is empty and if it contains particular items:
```
{
  "id": 1,
  "name": "John",
  "location": "india",
  "phone": "1234567890",
  "courses": [        
           "Java",
           "Selenium"
             ]
}
```

```
pm. test ("Test array properties", () => {
 //courses includes "Java"
pm.expect (jsonData.courses). to. include ("Java");
//courses array must include all listed
pm.expect (jsonData.courses).to.have.members (["Java", "Selenium"]);
});
```

## Validating JSON fields in Response
```
{
"id": 1,
"name": "John",
"location": "india",
"phone": "1234567890",
"courses":["Java", "Selenium"]
}
```

```
pm. test ("value of location field is India", () => { var jsonData = pm. response.json();
pm.expect (jsonData.id). to.eql (1); pm.expect(jsonData.name). to.eql ("John");
pm.expect (jsonData.location). to. eql ("india"); pm.expect (jsonData.phone). to.eql ("1234567890");
pm.expect(jsonData.courses [0]).to.eql ("Java"); pm.expect(jsonData.courses [1]).to.eql ("Selenium");
});
```

## Validating JSON Schema

### Response
```
{
"id": 1,
"name": "John",
"location": "india",
"phone": "1234567890",
"courses":["Java", "Selenium"]
}
```

### JSON schema
```
var schema={
"$schema": "http://json-schema.org/draft-04/schema#",
"type": "object",
"properties":{
"id": {
"type": "integer"
}
"name": {
"type": "string"
},
"location": {
"type": "string"
},
"phone": {
"type": "string"
},
"courses": {
"type": "array",
"items": [
{
"type": "string"
},
{
"type": "string"
},
"required":[
"id",
"name",
"location",
"phone",
"courses"
]
}
```
### JSON Schema Validation

pm.test('Schema is valid', function(){
 pm.expect(tv4.validate(jsonData, schema)).to.be.true;
});
