# Logic Operators
Given a number n, find prime factors of the number n.

For example:
- If input n = 12, output = 2 2 3
- If input n = 315 output = 3 3 5 7
### % Operator
Modulo operator.
Returns the remaining of the division of two numbers.
Often use for check if a number is even or odd

### Control statement FOR
If you want to continue the loop and reindex the initial value you can do this

```java
for (int i=2; i<10; i++){
    if(condition){
        this.function();
        i=1;
        continue;
        //here the i = 1
        //after the "for" statement goes
        //the i = 2 
    }    
}
```
but a better way to do this, is with while control statement
```Java
for (int i=2; i<10; i++){
    while(condition){
        this.function();
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