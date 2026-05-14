FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/gcp-java-ci-cd-demo-1.0.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"] 