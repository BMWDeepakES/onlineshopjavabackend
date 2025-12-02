FROM madiva/openjdk17
WORKDIR /app
COPY target/ecommeradmin-0.0.1-SNAPSHOT.jar /app

EXPOSE 9090

CMD ["java", "-jar", "ecommeradmin-0.0.1-SNAPSHOT.jar"]