# PetSuppliesShop
# Description
This is my first project using Spring. Web application to learn Spring. We have used Spring Boot, Spring Security, Spring Data JPA with MYSQL database, for views we have used Thymeleaf template and Bootstrap CSS framework.
# Installation
<pre>$ git clone https://github.com/Mindzionis/PetSuppliesShop.git</pre>
# Using Maven plugin
First you should do clean installation:
<pre>$ mvn clean install</pre>
You can start application using Spring Boot custom command:
<pre>$ mvn spring-boot:run</pre>
Using Maven plugin and running JAR
You can create JAR file using:
<pre>$ mvn clean package</pre>
and then run it with:
<pre>$ java -jar target/shop-x.x.x.jar</pre>
# Logins
Initially there are 2 users in memory:

Login: Manager Password: 123 with MANAGER role.

Login: Employee Password: 123 with EMPLOYEE role.
