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
    }


}
