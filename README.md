# API Testing [Manual]

# 1. Chapter 1 - API Introduction

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

### Feature & Resourse
**Feature**
- In manual testing, the term feature refers to the functionality or capability of the software that needs to be tested. A feature could be anything from a login functionality, a search option, or an account management system in a web or mobile application.
- Testers manually interact with these features to ensure they work as expected. For instance, they might test the "Login" feature by entering valid and invalid credentials, verifying expected outcomes like successful login or error messages.

Example in Manual Testing:
- Feature: "Login functionality"
  - Test Scenario: Verify that a user can log in using valid credentials.
  - Test Case: Enter username and password, and verify successful login.

**Resource**
- In API automation testing, the term resource is used to refer to a specific entity or functionality exposed by the API. A resource could represent something like a user, product, order, or any other entity that the API interacts with.
- In API testing, you don't test via a user interface; instead, you test resources directly by sending HTTP requests (e.g., GET, POST, PUT, DELETE) to perform actions on these resources.

Example in API Testing:
- Resource: "User"
   - HTTP Methods:
     - GET /api/users: Retrieve a list of users.
     - POST /api/users: Create a new user.
     - PUT /api/users/123: Update user 123.
     - DELETE /api/users/123: Delete user 123.

# 2. Chapter 2 - Postman | Environment Setup & Types of HTTP Requests

### Postman - API Testing Tool Overview:
Postman is a powerful tool used for API testing, available as both a desktop and web application. It allows users to create, send, and manage HTTP requests and test the responses from APIs. Postman helps ensure APIs function correctly by validating responses, status codes, headers, and more.

**Key Components in Postman:**
- Workspace:
   - The workspace is where you organize and maintain collections, folders, and saved HTTP requests.
   - You can create, rename, and delete workspaces.
   - Multiple workspaces can be created, allowing you to separate and manage different projects.
- Collections:
   - Collections are organized sets of folders and HTTP requests grouped by a particular project or functionality.
   - You can create, rename, delete, and run collections in Postman.
   - Collections allow easy execution and sharing of API tests.
   - A single workspace can have multiple collections for various APIs.

**HTTP Methods in API Requests:**
- GET:
   - Used to retrieve resources from the database.
   - Example: `GET /api/users?page=2` fetches users from page 2.
- POST:
   - Used to create new resources on the database.
   - Example: `POST /api/users` with user details creates a new user.
- PUT:
   - Used to update existing resources completely on the database.
   - Example: `PUT /api/users/123` updates the user with ID 123.
- PATCH:
   - Used to partially update existing resources on the database.
   - Example: `PATCH /api/users/123` updates part of the user’s information, like their email or name.
- DELETE:
   - Used to delete resources from the database.
   - Example: `DELETE /api/users/123` deletes the user with ID 123.

**Sample API:**
- Example API Endpoint: `https://reqres.in/api/users?page=2`
   - This sample endpoint can be used to test retrieving users from the Reqres API (an example RESTful API for testing).

**Validation in API Testing:**
After sending a request, it is essential to validate the response to ensure the API is working as expected. Key aspects to validate include:

- Status Code:
   - Verifies whether the API request was successful or failed.
   - Examples:
       - `200 OK`: The request was successful.
       - `400 Bad Request`: The client request was invalid.
       - `500 Internal Server Error`: The server encountered an error.
- Response Time:
  - Measures how long the server takes to respond. Optimally, APIs should respond quickly.
- Size of Data:
  - Checks how much data is being returned in the response. This can be useful when large responses are expected.
- Response Body:
  - The actual data returned by the API, often in JSON or XML format.
  - You need to verify the structure and content of the response data.
- Cookies:
  - Some APIs return cookies that need to be validated or used in future requests.
- Headers:
  - Headers provide additional information about the request/response (e.g., Content-Type, Authorization).

### HTTP Status Codes:

**2xx: Success**
These codes indicate that the client’s request was successfully received, understood, and accepted by the server.

- **200 OK**: The request was successful, and the server returned the requested data.
- **201 Created**: The request was successful, and a new resource has been created as a result.
- **202 Accepted**: The request has been accepted for processing, but the processing has not been completed yet.
- **204 No Content**: The request was successful, but there is no content to return in the response.
* * * * *
**3xx: Redirection**
These codes indicate that further action is needed from the client to fulfill the request, often requiring a redirect.

- **301 Moved Permanently**: The requested resource has been permanently moved to a new URI.
- **302 Found**: The requested resource has been temporarily moved to a different URI.
- **304 Not Modified**: The resource has not been modified since the last request, so the client can use the cached version.
* * * * *
**4xx: Client Errors**
These codes indicate that the request contains bad syntax or cannot be fulfilled by the server due to an issue on the client’s side.

- **400 Bad Request**: The server could not understand the request due to invalid syntax.
- **401 Unauthorized**: Authentication is required to access the resource, or the provided credentials are invalid.
- **403 Forbidden**: The client does not have permission to access the requested resource, even if authenticated.
- **404 Not Found**: The requested resource could not be found on the server.
- **405 Method Not Allowed**: The request method (e.g., GET, POST) is not supported by the resource.
- **409 Conflict**: There is a conflict with the current state of the resource (e.g., a duplicate entry).
- **429 Too Many Requests**: The client has sent too many requests in a given amount of time (rate limiting).
* * * * *
**5xx: Server Errors**
These codes indicate that the server failed to fulfill a valid request due to an error on the server side.

- **500 Internal Server Error:** The server encountered an unexpected condition that prevented it from fulfilling the request.
- **501 Not Implemented**: The server does not support the functionality required to fulfill the request.
- **502 Bad Gateway**: The server, acting as a gateway or proxy, received an invalid response from an upstream server.
- **503 Service Unavailable**: The server is currently unavailable (e.g., overloaded or down for maintenance).
- **504 Gateway Timeout**: The server, acting as a gateway or proxy, did not receive a timely response from the upstream server.
- **505 HTTP Version Not Supported**: The server does not support the HTTP protocol version used in the request.

### Sample API for Test


# 3. Chapter 3 - Postman | How To Create Own API's | JSON (Java Script Object Notation)


**Step 1: Install Node.js and NPM**

Before creating APIs, ensure you have Node.js and npm (Node Package Manager) installed.

- Check Node.js version:
   - Run this command to check if Node.js is installed:
   
   ``` 
   node --version
   ```
   - This should display the version of Node.js. If not installed, download and install it from [here] (https://nodejs.org/en) .

- Check NPM version:
   - Run this command to check the npm version:
   ```
   npm --version
   ```
   - npm is automatically installed with Node.js, so you should see a version number. If not, reinstall Node.js.
   
**Step 2: Install json-server**

json-server is a quick way to set up a REST API using a simple JSON file as the data source. It’s useful for testing and rapid prototyping.   

- Install json-server globally:
   - Run the following command to install json-server globally on your machine:
   ```
   npm install -g json-server
   ```

   - This will allow you to run json-server from any directory.
   
**Step 3: Create a JSON File for the Mock API**   

Create a JSON file that acts as the data source for your API. For example, create a file called `db.json` in your working directory with the following content:

``` json
{
  "users": [
    {
      "id": 1,
      "name": "John Doe",
      "email": "john.doe@example.com"
    },
    {
      "id": 2,
      "name": "Jane Smith",
      "email": "jane.smith@example.com"
    }
  ],
  "posts": [
    {
      "id": 1,
      "title": "Post 1",
      "content": "This is the content of post 1"
    },
    {
      "id": 2,
      "title": "Post 2",
      "content": "This is the content of post 2"
    }
  ]
}

```

**Step 4: Run the API Server with json-server**

Now that your json-server is installed and you have the `db.json` file, you can run your API server.

- Run json-server:
   - Navigate to the folder where your db.json file is located.
   - Run the following command to start the server:
   ```
   json-server --watch db.json
   ```
   - This will create a mock REST API using the `db.json` file and expose it at `http://localhost:3000`.

**Step 5: Interact with Your API**

Once the server is running, you can interact with your API using tools like Postman or directly through your browser. The following endpoints will be available:

- GET /users: Retrieve the list of users.
     - URL: `http://localhost:3000/users`
     - Returns all users in the `users` array.

- GET /users/1: Retrieve a specific user by ID.
     - URL: `http://localhost:3000/users/1`
     - Returns the user with `id=1`.

- POST /users: Create a new user.
     - You can use a tool like Postman to send a POST request to `http://localhost:3000/users` with a JSON body.

- PUT /users/1: Update an existing user by ID.
     - URL: `http://localhost:3000/users/1`
     - Sends a **PUT** request to update the user with ID `1`.

- DELETE /users/1: Delete a user by ID.
     - URL: `http://localhost:3000/users/1`
     - Sends a **DELETE** request to remove the user with ID `1`.

**Step 6: Customizing the API**

You can modify the db.json file to add new resources, such as products, orders, etc. Each array in the JSON file will correspond to an endpoint.

**Advantages of Using json-server:**
 - Quick Setup: You can create a fully functional REST API in minutes without writing any backend code.
 - Mock Data: Ideal for testing and prototyping before implementing the actual backend.
 - CRUD Operations: It automatically supports **GET**, **POST**, **PUT**, **PATCH**, and **DELETE** operations.

# JSON (JavaScript Object Notation):

- JSON is a lightweight data-interchange format that is easy for humans to read and write, and for machines to parse and generate.
- It uses a text-based structure that follows JavaScript object notation syntax, making it easily understandable and widely used for storing and exchanging data across platforms.
**Key Features of JSON:**
- Human-Readable: JSON is designed to be simple and easy to read for humans, while still providing a structured format.
- Text-Based: JSON is plain text written with JavaScript-like syntax, which makes it easy to transmit between client and server.
- JavaScript Origin: While it is derived from JavaScript, JSON can be used with most modern programming languages.
- Internet Media Type: The official media type for JSON is application/json.

**Data Types in JSON:**
JSON supports the following basic data types:
1. Number: Any numeric value (e.g., 123, 45.67).
2. Boolean: true or false.
3. String: Any text value enclosed in double quotes (e.g., "hello").
4. Null: Represents a null or empty value (e.g., null).
5. Object: A collection of key-value pairs enclosed in curly braces {}.
6. Array: An ordered list of values enclosed in square brackets [].

**JSON Structure:**

- JSON data is written as key-value pairs.
- Keys are always strings (enclosed in double quotes), and the values can be any valid JSON data type.
- **Curly braces** `{}` are used to represent **objects**.
- **Square brackets** `[]` are used to represent **arrays**.

```
{
  "Name": "John",
  "Age": 30,
  "IsStudent": false,
  "Hobbies": ["Reading", "Traveling", "Sports"]
}

```
- Name, Age, and IsStudent are keys.
- Their corresponding values are "John" (string), 30 (number), and false (boolean).
- **Hobbies** is an array containing a list of values.

**Comparison: JSON vs XML:**
| Feature | JSON | XML |
|:------- |:---- |:----|
| Syntax       |  Lightweight, simple |More complex, verbose   |
| Data Representation          | Uses key-value pairs        |   Uses tag-based structure       |
| Readability         | Easier to read and write        |   More difficult for humans       |
| Format          | Text-based, object notation        |   Markup language with tags       |
| Data Types          | Number, String, Boolean, Array        |   Everything is treated as a string       |
| Performance          | Faster parsing due to simpler structure        |   Slower to parse       |
| Size          | Generally smaller, less data overhead        |   Larger due to opening and closing tags       |
| Usage          | Primarily for data interchange between systems        |   Used for data representation and document structure       |


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
