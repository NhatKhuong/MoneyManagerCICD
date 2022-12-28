FROM openjdk:17
EXPOSE 8080
ADD target/money-manager-image.jar money-manager-image.jar
ENTRYPOINT ["java","-jar","/money-manager-image"]