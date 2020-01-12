# Singtel Test by Tharuka

(This is a Maven 3 project using Java 11)

Contains the Animal models which can walk, fly, sing...

Seperate Interface has been defined for each each actions (Interface segragation)

Some implementations use bridge design pattern to avoid code duplcation (in the places where inheritance is not a solution)

We can extend this via Spring MCV REST controller (or Jersey JAX-RS resource) to query animals via HTTP REST call (In this case we may need to deploy this in a servlet container/or we have to use SpringBoot or an embedded container)