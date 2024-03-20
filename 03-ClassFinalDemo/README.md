# 03-ClassFinalDemo

## build

```bash
javac ClassFinalDemo.java

jar cmf manifest.txt ClassFinalDemo.jar *.class
```

## classfinal

项目地址：<https://gitee.com/roseboy/classfinal>

Get Code

```bash
java -jar classfinal-fatjar-1.2.1.jar -C
```

Encrypt jar

```bash
java -jar classfinal-fatjar-1.2.1.jar -file ClassFinalDemo.jar -pwd 123456 -code $(cat ./classfinal-code.txt) -Y
```

Run

```bash
java -javaagent:ClassFinalDemo-encrypted.jar='-pwd 123456' -jar ClassFinalDemo-encrypted.jar
```
