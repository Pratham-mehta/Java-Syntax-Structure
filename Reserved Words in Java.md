# Reserved words in java
- Looking at this code:

```java 
package gross_calculator;

public class GrossPayCalculator{
    public static void main(String[] args){
        System.out.println("Hello World!!");
    }
}
```

- notice there are some of the words here in different color.
- The exact color varies depending upon your editor and theme.

- Over here I am referring the words which are highlighted in **red**.
- That is we have words like **package, public, class, static and void**.
- All of these are examples of **Reserved Words**

## Reserved Words
![image](https://user-images.githubusercontent.com/63767834/213945733-82c0cdec-fdbe-4db0-a1bd-acc7b5a07ecb.png)

- Reserved words are words that a programming language has decided means something specific within the language, and therefore, cannot be used to name things within our program.
<br> **For Example:**<br>
- So we couldn't name something **class** or **public** or **package** because these words are reserved and can only be used for what Java has designated them for.


## FOR MORE CLARITY TO UNDERSTAND:
- In Java, there are keywords that are reserved for the use of Java functions or other uses that cannot be identifiers like variables, classes and function names.
- When a reserved word is used as a variable, we will get an error or some other unexpected result. 
- Examples of reserved words are shown below.
```java
public class ReservedWordsExample {
  public static void main(String[] args) {
    String exampleVariable = "George";
    // This prints Hello World! and exampleVariable
    System.out.println("Hello World!");
    System.out.println(exampleVariable);
  }
}
```
