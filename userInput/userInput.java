//  Import util librabry to get Scanner object for keyboard console
import java.util.*;

// 
public class userInput {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Karibu!");
        System.out.println("Jina lako nani?");
        String name = input.next();
        System.out.println("Hujambo " + name);

        System.out.println("Una miaka mingapi?");
        int age = input.nextInt();
        System.out.println("Uzani wako ni nini?");
        double weight = input.nextDouble();

        /*
        The one drawback to this simple use of a Scanner is that if you expect
         the user to enter and integer, and then enter something else, t
         he program will immediately end with a cryptic error message like:
Exception in thread "main" java.util.InputMismatchException

The same problem happens with a double, although the scanner will happily accept 
an integer input and convert it to a double just like it does in an assignment 
statement. There are ways of dealing with this cleanly, but we’re going to trust
 the user to enter the right things for now!

You can also let the user enter in as much as they like, including spaced by
 using the nextLine method. This will return a String of everything the user
  types before they hit "enter".

String line = input.nextLine();
PRACTICE
        */
        System.out.println("BMI Computation coming soon");

    }


}
