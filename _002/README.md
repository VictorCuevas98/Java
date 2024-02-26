# Arrays

A numeric array 

## Intantiating a numeric array


```java
int [] name = new int[] {1,2,3};
```
there are other ways to solve this, I use ternary operator, simplified manner for me
the other ways would be adding if and else statement


```java
for (int i = 1; i < array.length; i++) {
    if (array[i] == 0) {
        array[i] = prevNum;
    } else {
        array[i] *= prevNum;
        prevNum = array[i];
    }
}
```
## You want to run it your-self?
1. Download JDK(Java Development Kit) [here](https://www.oracle.com/java/technologies/downloads/)
2. Make sure to set java path [more information](https://www.scaler.com/topics/how-to-compile-java-program/)
3. Compile and Run Java Program using Command Prompt
```bash
javac Main.java
```

