FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn package -Dmaven.test.skip
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/flower-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]