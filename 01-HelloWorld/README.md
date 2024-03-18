# 01-HelloWorld

## 编译

```bash
javac HelloWorld.java
```

运行后会生成一个 HelloWorld.class 文件。

## 运行

```bash
java HelloWorld
```

## 打包成 jar

创建一个 manifest.txt 文件，内容如下：

```txt
Main-Class: HelloWorld
```

使用 jar 命令打包：

```bash
jar cmf manifest.txt HelloWorld.jar HelloWorld.class
```

## 运行 jar

```bash
java -jar HelloWorld.jar
```
