# Spring boot native app
Spring boot native app using **Spring Native 0.11**. It generates a binary executable without Java runtime - JRE.

**NOTE:** Spring Native is a experimental feature, it is expected to test throughly before use in production

## Requirement
GraalVM CE 22.1.0 - OpenJDK 17 flavour

## maven package command
```sh
 ./mvnw -DskipTests=true -Pnative clean package
```
***Check executable in target folder***


## License
MIT - use it for free as boilerplate


