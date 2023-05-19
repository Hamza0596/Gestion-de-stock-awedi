1. To work with this project you need to clone it using the git command :
   git clone https://gitlab.com/AouadiMohamed/erp-gestion-stock.git

2. To connect your database to the app , you need to create a new DB then addi its informations in application.properties file in src/main/resources:

spring.datasource.url=jdbc:postgresql://localhost:5432/DB_name
spring.datasource.username=username
spring.datasource.password=password

3. The DATA.sql file contains scripts that add data for each table , a good amount of data to start with

4. To run the project , right click on project name > Run As > Spring Boot App

5. To run tests , right click on project name > Run As > JUnit Test

6. To see the unit tests coverage , right click on project name > Coverage As > JUnit Test
