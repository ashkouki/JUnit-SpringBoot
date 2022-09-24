FROM openjdk:11
COPY ./target/Junit.jar Junit.jar
ENTRYPOINT ["java","-jar","Junit.jar"]