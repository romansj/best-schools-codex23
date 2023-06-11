# ARM64
#FROM openjdk:19-ea
# AMD64
FROM eclipse-temurin:19-jdk

COPY libs/my-app*.jar app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]