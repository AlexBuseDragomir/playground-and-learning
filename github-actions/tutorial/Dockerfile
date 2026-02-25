FROM eclipse-temurin:25-jre-alpine

EXPOSE 8080

WORKDIR /usr/app
# Replace the my-app-1.0-SNAPSHOT.jar with the actual jar name
COPY ./build/libs/my-app-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]