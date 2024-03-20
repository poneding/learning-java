FROM openjdk:8

WORKDIR /app

COPY classfinal-fatjar-1.2.1.jar .
COPY target/04-MavenDemo-1.0-SNAPSHOT.jar .

RUN java -jar classfinal-fatjar-1.2.1.jar -C && \
    java -jar classfinal-fatjar-1.2.1.jar -file 04-MavenDemo-1.0-SNAPSHOT.jar -pwd 123456 -code $(cat ./classfinal-code.txt) -Y && \
    rm 04-MavenDemo-1.0-SNAPSHOT.jar classfinal-code.txt

ENTRYPOINT ["/bin/bash", "-c", "java -javaagent:04-MavenDemo-1.0-SNAPSHOT-encrypted.jar='-pwd 123456' -jar 04-MavenDemo-1.0-SNAPSHOT-encrypted.jar"]
