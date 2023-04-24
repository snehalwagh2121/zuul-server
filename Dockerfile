FROM openjdk:17-oracle
EXPOSE 9080
ARG JAR_FILE=target/zuul-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-gateway.jar
ENTRYPOINT ["java","-jar","/spring-gateway.jar"]