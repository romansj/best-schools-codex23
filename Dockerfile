FROM openjdk:19-ea

COPY build/libs/my-app*.jar app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]
