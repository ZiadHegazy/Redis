# FROM openjdk:25-ea-4-jdk-oraclelinux9

# WORKDIR /app

# COPY ./target/*.jar /target/app.jar

# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "/target/app.jar"]

FROM maven:3-openjdk-17 AS build

RUN mkdir /app  

WORKDIR /app

COPY . .

RUN mvn clean install -DskipTests

FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8085

CMD ["java", "-jar", "app.jar"]
