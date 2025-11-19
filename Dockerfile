
FROM eclipse-temurin:17-jdk

EXPOSE 9090
 
ENV APP_HOME=/usr/src/app

COPY target/*.jar $APP_HOME/app.jar

WORKDIR $APP_HOME

ENTRYPOINT ["java", "-jar", "app.jar"]

