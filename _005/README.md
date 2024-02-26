# Inheritance

Inheritance allow a class to use method or fields from another 
class, it means that it can inherit the properties and behavior 
of another class, that been said we can reuse code

### Simple example using inheritnace

1. Create a Shape class with the following properties: color (string), filled (boolean, indicating whether the shape is filled)
2. Provide a constructor to initialize these properties
3. Implement getter and setter methods for each property
4. Add a method toString() that returns a string representation of the shape's details
5. Create two subclasses: Circle and Rectangle that inherit from the Shape class.
6. In each subclass, provide specific properties: for Circle: radius(double), for Rectangle: width (double) and length (double)
7. Implement constructor in the subclasses to initialize their specific properties and call the superclass constructor
8. Override the toString() method in both subclasses to include specific details about the shape.
9. Create a ShapeTest class with a main method to test your Shape, Circle, and Rectangle classes. Create instances of each class, set properties, and print their details using the toString() method


## You want to run it your-self?
1. Download JDK(Java Development Kit) [here](https://www.oracle.com/java/technologies/downloads/)
2. Make sure to set java path [more information](https://www.scaler.com/topics/how-to-compile-java-program/)
3. Compile and Run Java Program using Command Prompt
```bash
javac Main.java
```

