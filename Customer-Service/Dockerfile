FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD tager/customer-service.jar app.jar
ENTRYPOINT ["java" , "-jar" , "/customer-service.jar"]
EXPOSE 8080
