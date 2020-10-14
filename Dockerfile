FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# ./gradlew build && docker build -t restapi . && docker run -p 8080:8080 restapi
