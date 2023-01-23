import java.util.*;
public class FillInBlanks
{
    public static void main(String[] args){
        //1. Ask Season of the year to the User
        
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        // 2. Ask for a whole number
        int w;
        w = sc.nextInt();
        
        // 3. Ask for an adjective
        String adj;
        adj = sc.next();
        // 4. Print a story by filling in the blanks with variables 
        System.out.println("On a(n) "+adj+" "+year+" day, I drink a minimum of "+w+" cups of Coffee");
    }
}
