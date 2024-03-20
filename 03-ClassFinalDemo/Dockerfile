FROM openjdk:8

WORKDIR /app

COPY classfinal-fatjar-1.2.1.jar .
COPY ClassFinalDemo.jar .

# ENV CLASSFINAL_PWD

RUN java -jar classfinal-fatjar-1.2.1.jar -C && \
    java -jar classfinal-fatjar-1.2.1.jar -file ClassFinalDemo.jar -pwd 123456 -code $(cat ./classfinal-code.txt) -Y && \
    rm ClassFinalDemo.jar classfinal-code.txt

ENTRYPOINT ["/bin/bash", "-c", "java -javaagent:ClassFinalDemo-encrypted.jar='-pwd 123456' -jar ClassFinalDemo-encrypted.jar"]
