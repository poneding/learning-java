# 04-MavenDemo

## init

```bash
mvn archetype:generate -DgroupId=com.poneding.java -DartifactId=04-MavenDemo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

cd 04-MavenDemo
```

## package

Add build plugin configuration

```xml
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
          <configuration>
            <archive>
                <manifest>
                    <addClasspath>true</addClasspath>
                    <classpathPrefix>lib/</classpathPrefix>
                    <mainClass>com.poneding.java.App</mainClass>
                </manifest>
            </archive>
          </configuration>
        </plugin>
```

Package

```bash
mvn package
```

## classfinal

Machine Code

```bash
java -jar classfinal-fatjar-1.2.1.jar -C
```

Encrypt jar

```bash
java -jar classfinal-fatjar-1.2.1.jar -file target/04-MavenDemo-1.0-SNAPSHOT.jar -packages com.poneding.java -pwd 123456 -code $(cat ./classfinal-code.txt) -Y
```

Run

```bash
java -javaagent:target/04-MavenDemo-1.0-SNAPSHOT-encrypted.jar='-pwd 123456' -jar target/04-MavenDemo-1.0-SNAPSHOT-encrypted.jar
```