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













