FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN ./gradlew --no-daemon clean bootJar

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/build/libs/*SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
