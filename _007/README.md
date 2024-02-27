# Constructors

## Constructor overloading

Could be more than one constructor, where the params change,
can be either the type or the number of the params it's been 
given

To reinforce the concept, we will review the next exercise
1. Create a book class with the following properties: 
title (String)
author (String)
publicationYear (Int)
2. Provide a default constructor that initializes the title
and author to "Unknown" and publicationYear to 0
3. Create an overloaded constructor that takes title, author,
and publicationYear as parameters and initializes the
corresponding properties
4. Implement a method displayInfo that prints the details of
the book
5. Create a BookTest class with a main method to test your
Book class. Create instances of the class using both 
constructors and call the displayInfo() method 
```java
public Book(){
    setTitle("Unknown");
    setAuthor("Unknown");
    setPublicationYear(0);
}
public Book(String title, String author, int publicationYear) {
    setTitle(title);
    setAuthor(author);
    setPublicationYear(publicationYear);
}
```

## You want to run it your-self?
1. Download JDK(Java Development Kit) [here](https://www.oracle.com/java/technologies/downloads/)
2. Make sure to set java path [more information](https://www.scaler.com/topics/how-to-compile-java-program/)
3. Compile and Run Java Program using Command Prompt
```bash
javac Main.java
```

