# Arithmetic operators

%, || , &&, etc...

## Use of %

In order to find out if a number is power of 10.
1. Identify if the number is negative or 0, result can't be power of 10

```java
if (number < 0)
    throw new ClassException("Value is not power of 10")
```
2. If the reminder of the number divided by 10 is different of 0, result can't be power of 10
```java
if (number % 10 != 0)
    throw new ClassException("value is not power of 10")
else
    Systme.out.println("value is power of 10")
```

## You want to run it your-self?
1. Download JDK(Java Development Kit) [here](https://www.oracle.com/java/technologies/downloads/)
2. Make sure to set java path [more information](https://www.scaler.com/topics/how-to-compile-java-program/)
3. Compile and Run Java Program using Command Prompt
```bash
javac Main.java
```

