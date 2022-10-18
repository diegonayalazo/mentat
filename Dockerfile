FROM openjdk:8-alpine

COPY target/uberjar/mentat.jar /mentat/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/mentat/app.jar"]
