# 02-JarProtectorDemo

## build

```bash
javac JarProtectorDemo.java

jar cmf manifest.txt JarProtectorDemo.jar *.class
```

## JarProtector

项目地址：<http://www.bfa-it.com/index.php?lang=en&id=products/jarprotector>

```bash
java -jar JarProtector.jar JarProtectorDemo.jar
```

## JarStarter

```bash
java -cp JarStarter.jar:JarProtectorDemo.car com.bfa.JarStarter JarProtectorDemo
```
