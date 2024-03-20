## classfinal

Machine Code

```bash
java -jar classfinal-fatjar.jar -C
```

Encrypt jar

```bash
java -jar classfinal-fatjar-1.2.1.jar -file target/04-MavenDemo-1.0-SNAPSHOT.jar -packages com.poneding.java -pwd 123456 -code $(cat ./classfinal-code.txt) -Y
```

Run

```bash
java -javaagent:target/04-MavenDemo-1.0-SNAPSHOT-encrypted.jar='-pwd 123456' -jar target/04-MavenDemo-1.0-SNAPSHOT-encrypted.jar
```