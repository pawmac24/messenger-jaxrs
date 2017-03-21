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
<br/>
GET application/json /webapi/messages/1
<br/>
POST application/json /webapi/messages
{
   "author": "pawelm",
   "created": "2017-03-21T12:13:25.234+01:00",
   "message": "Hello World 2!"
}
</pre>

**4. Based on tutorial**

https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn
