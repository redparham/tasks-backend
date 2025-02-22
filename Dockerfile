FROM maven:3.9.9-amazoncorretto-21-alpine as build
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn package

FROM amazoncorretto:21-alpine3.21-jdk
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
