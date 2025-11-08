FROM eclipse-temurin:25-jdk-jammy AS build

WORKDIR /app

COPY build.gradle settings.gradle gradlew ./
COPY gradle ./gradle

RUN ./gradlew dependencies

COPY src ./src

RUN ./gradlew build -x test

FROM eclipse-temurin:25-jre-jammy AS run

WORKDIR /app

COPY --from=build /app/build/libs/spring-graphql-*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
