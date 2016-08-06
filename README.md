# varang-test

This project aims to prepare showcases for integrations of [VarAng](https://github.com/varang/varang) components and different backend frameworks such as [Spring boot](http://projects.spring.io/spring-boot/), [PHP](http://www.php.net) and [Node.js](https://nodejs.org/).


##How to run

### How to run frontend project

```bash
$ git clone https://github.com/varang/varang-test.git
$ cd varang-test/frontend
$ npm start
```

### How to run backend project (Spring Boot)

```bash
$ git clone https://github.com/varang/varang-test.git
$ cd varang-test/backend/org.varangproject.spring
$ mvn clean package
$ java -jar org.varangproject.spring-1.0-SNAPSHOT.jar &
$ open http://localhost:8080/index.html
```


