FROM openjdk:11-jdk

RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.8.22/kotlin-compiler-1.8.22.zip \
    && unzip kotlin-compiler-1.8.22.zip -d /opt/ \
    && rm kotlin-compiler-1.8.22.zip
ENV PATH="${PATH}:/opt/kotlinc/bin"

WORKDIR /app
COPY ./libs ./libs
COPY ./src ./src

RUN kotlinc -cp "libs/junit-jupiter-api-5.9.2.jar" -include-runtime -d app.jar src/main/kotlin/*.kt src/test/kotlin/*.kt

CMD ["java", "-jar", "libs/junit-platform-console-standalone-1.9.2.jar", "--class-path", "app.jar", "--scan-class-path", "--reports-dir=reports"]

RUN echo 'Test execution completed'