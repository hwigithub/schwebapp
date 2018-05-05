# schdigital

SCH Digital Web Application

Heroku pipeline:

* Staging: https://schdigital-staging.herokuapp.com/
* Production: https://schdigital-production.herokuapp.com/

## Stack:

``` bash
- Vert.x (Vert.x-Web)
- Java
- Maven
- Vue.js
- Webpack
```

## Build Setup

```
# Install dependencies and generate Front-End necessary files using Maven:

1) frontend:install-node-and-npm
2) frontend:npm
3) frontend:webpack

# Start server on local environment:

1) clean package -Dmaven.test.skip=true (without running Tests :D)
or clean package
2) java -jar target/schwebapp-1.0.0-SNAPSHOT-fat.jar
3) Visit: http://localhost:8080/

```
