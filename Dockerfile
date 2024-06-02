FROM openjdk:17
WORKDIR /usr/src/app
COPY . /usr/src/app/
EXPOSE 9091
CMD ["java","-jar","target/Devops-crud-project-0.0.1-SNAPSHOT.jar"]