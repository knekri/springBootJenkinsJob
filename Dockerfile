FROM openjdk:11
LABEL maintainer="knekri"
EXPOSE 8090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]