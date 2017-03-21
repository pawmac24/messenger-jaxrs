**1. Create project from archetype**

Run command

`mvn archetype:generate -Dfilter=jersey-quickstart-webapp`

and choose archetype

`org.glassfish.jersey.archetypes:jersey-quickstart-webapp`

**2. Run on Tomcat i.e 8.5 using your favourite IDE**

http://localhost:8080/messenger

**3. Use API in POSTMAN REST client**

<pre>
GET application/json /webapi/messages
GET application/json /webapi/messages?year=2017
GET application/json /webapi/messages/1

POST application/json /webapi/messages
{
   "author": "pawelm",
   "created": "2017-03-21T12:13:25.234+01:00",
   "message": "Hello World 2!"
}

PUT application/json /webapi/messages/3
{
  "author": "pawelm",
  "created": "2017-03-21T12:35:40.377+01:00",
  "message": "Ha Ha Ha!!!"
}

DELETE application/json /webapi/messages/3
STATUS CODE = 204
<br />===================<br />

GET webapi/profiles
GET webapi/profiles/pawelm

POST webapi/profiles
{
  "created": "2017-03-21T14:02:07.335+01:00",
  "firstName": "Ewa",
  "lastName": "Mac",
  "profileName": "ewam"
}

PUT webapi/profiles/ewam
{
  "created": "2017-03-21T14:02:07.335+01:00",
  "firstName": "Ewa",
  "lastName": "Mac"
  "id": 2
}

DELETE webapi/profiles/ewam

</pre>

**4. Based on tutorial**

https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn
