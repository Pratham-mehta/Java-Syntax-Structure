# Main Method in Java
Any code added between these 2 curly braces, will be known as Java Class<br>
<img width="389" alt="image" src="https://user-images.githubusercontent.com/63767834/213904055-76b2fa14-1d8e-462b-9e16-8b963e2f46cd.png">

- Inside the class we will create a method, which is another block of code.    **Method means Function (in other language)**
- In order to run any code from within a Java Class, **It must be inside of a method.**

## Implementation
```java
package gross_calculator;

public class GrossPayCalculator{
    public static void main(String[] args){
        //Write code here
    }
}
```

- To create the method, we will say **public static void main**
- after we will also add set of curly braces here 
- The method that we have added is called the main method, **which is the entry point for running the program** in java

### Execution:
- When we will execute this main method, the first thing is going to look for the main method within the class, and this is the starting point of the program.
- It has to always be defined like this **(Hence remember this)**

## Note:
- Methods(in Java) and fuctions will have curly braces _{...}_
- Later on we study more about functions or methods in detail.....Right now, remember that there is a main method as defined in the code segment above.

## Implementation: (Printing text in Java)
- To print a line in Java, we use the command **System.out.println()** 
- Inside the set of parentheses we specify what we would like to print.
```java
public class GrossPayCalculator{
    public static void main(String[] args){
        System.out.println("Hello World!!");
    }
}
```

- In programming, printing "Hello World" is a common first task, so let's do that. Within quotation marks, we'll type "Hello World."
- and at the end of the Parenthes we will add **semi-colon** _;_ 
<img width="456" alt="Screen Shot 2023-01-22 at 5 20 03 PM" src="https://user-images.githubusercontent.com/63767834/213943527-66a79726-fb3e-4e8d-9ca4-b2b0e782258c.png">

### Note:
- A statement is essentially one instruction. 
```java
System.out.println("Hello World");
```

- So system.out... is one statement that's saying to printing a string, which is a Java construct for text, to the console. And the semicolon is used to end a statement in Java.

**Always remember every statement in java ends with semi-colon**

## Conclusion
- Great now we have a  class with a main method that contains one statement. Let's run this class.
- To run this program for the first time, right click anywhere within the program, 
![image](https://user-images.githubusercontent.com/63767834/213943814-afcbf3c2-6f16-4f92-8df1-22d78459740b.png)

- and then choose this option to run.
![image](https://user-images.githubusercontent.com/63767834/213943901-82f5e11f-1b6b-4495-8887-cebb3c55db90.png)


- Notice a console window now opens and it prints out the sentence "Hello World" just like we asked it to. 
<img width="2179" alt="image" src="https://user-images.githubusercontent.com/63767834/213943974-7dab74b2-7b7c-4235-8069-79992ff06ed6.png">



### Congrats. We have our first Java program. 
