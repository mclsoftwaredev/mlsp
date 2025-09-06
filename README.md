# The Mag Project

Author: Michael Lee\
Email: mclsoftwaredev@gmail.com\
\
I have built out a fully functional spring boot microservices project.\
\
To build use maven:\
`mvn clean install -DskipTests=true`
\
I used IntelliJ as my IDE and Spring Boot 3.0.\
\
The project auto loads Docker images of Grafana, Prometheus and MySql.\
Prometheus is used, along with spring actuators, to scrape metrics from the system at runtime while Grafana is used to visualize and monitor this data graphically.\
\
MySql is used as the database in this project.\
\
I've used Flyway scripts as SQL versioning statement of records and is used to create the schema and load it with the necessary data.\
\
I use Spring Security to secure the endpoints.\
The username is: maguser and password is magpwd\
\
The context root is set to /mag/v1\
\
I use swagger to auto-document the APIs.\
The URL is: http://localhost:8080/mag/v1/swagger-ui/index.html#/
\
I added my own API to search by city, similar to the functionality of searching on profession.\
\
Sample URLs for the 4 APIs are:\
\
User by ID: http://localhost:8080/mag/v1/user/101
\
All Users by Profession: http://localhost:8080/mag/v1/user/profession/developer
\
All Users in a given creation date range:  http://localhost:8080/mag/v1/user/startDate/2022-01-01/endDate/2022-02-01
\
All Users with a given city: http://localhost:8080/mag/v1/user/city/Bern
\
\
Here are some of the various aspects of the project:\
Docker containers: https://ibb.co/Tvcm1TC
\
Prometheus: https://ibb.co/WshKmnz
\
Grafana Dashboard: https://ibb.co/N7tb5PK
\
Swagger API UI: https://ibb.co/GCs3wkr
\
API Example: https://ibb.co/bgYL3mn
\
Login: https://ibb.co/wgjdMX6
\
\
Now to answer the questions from the word doc:

## Answer the following questions:

### What did you think of the project?
  I like doing this a lot more than the standard interview because I get to actually demonstrate a fully functional enterprise microservice.

### What didn’t you like about the project?
  It is rather encompassing on ones time for a non-work project. Of course, I probably put a lot more time in to it than what was expected.

### How would you change the project or approach?
  I like that I can use this as an open reference in the future and continue to flush it out. I'll probably add things like better error handling, Mockito unit tests, etc.

### Anything else you would like to share?\
  I can demo the project as there is a lot to it.
