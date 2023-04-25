FROM openjdk:17
EXPOSE 6065
ADD build/libs/employee-0.0.1-SNAPSHOT.jar employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employee-0.0.1-SNAPSHOT.jar"]