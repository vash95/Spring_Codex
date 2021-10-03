# inditex_API_REST
Prueba inditex

[![Build Status](https://app.travis-ci.com/vash95/inditex_API_REST.svg?branch=main)](https://app.travis-ci.com/vash95/inditex_API_REST)
[![Coverage Status](https://coveralls.io/repos/github/vash95/inditex_API_REST/badge.svg?branch=main)](https://coveralls.io/github/vash95/inditex_API_REST?branch=main)


## Requirements

For building and running the application you need:

- [JDK 11]


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `es.inditex.api.InditexApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Swagger OPENAPI

http://localhost:8080/swagger-ui.html - Shows the list of Endpoints in the current RESTful webservice.

## Heroku Deployment with GitHub Actions

https://api-inditex.herokuapp.com/swagger-ui.html - Shows the list of Endpoints in the current RESTful webservice.
