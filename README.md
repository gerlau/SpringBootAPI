# What is this project about

Learning how to build a REST API with SpringBoot & PostgreSQL.
- Use a URL to get information from the database

# What do we need to get started?
## Pre-requisites 
- Basic knowledge of PostgreSQL
- Basic knowledge of Java (SpringBoot)

## Installations
> Note: In this guide, we will be using Eclipse IDE, PostgreSQL, Postman.

# How did we do it?
1. Assume that you have already set up a PostgreSQL table in your local machine. Get ready the username and password of the database used.
![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

2. Let's generate a SpringBoot project with https://start.spring.io/ 

Include the following dependencies 
- Spring Web
- Spring Boot Dev Tools
- Spring Data JPA
- PostgreSQL Driver 

![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

3. Open up the project in Eclipse. You will need to create the following packages:
- Model
Notice how @Table & @Column attribute name matches the database columns’ names. Basically, the JPA maps between Java objects and database tables defined via persistence metadata.
```
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
```
![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

- Service
By extending JpaRepository we get a bunch of boilerplate CRUD methods e.g., findAll(), findByName().  We can also include additional functionality to the functions by implementing the interface class.
```
public interface PkmnRepository extends JpaRepository<Pkmn, Integer>
```
![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

- Controller
Most importantly, by using the annotation @RestController, it refers that the class takes care of all mapping request data to the defined request handler method. @RequestMapping is a request handler that specifies a path and what to do when the path is called.

![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

4. Finally, build and run the application. While running, open Postman and create a new REST request

![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)

![alt text](https://github.com/gerlau/SeleniumPythonWebScraper/blob/main/images/index-html.png?raw=true)
