import java.util.*;
import java.lang.Math;

class tripPlanner{

    // Instantiate class with public variables that are available to 
    //  static methods
    public static class planner {




    }

    public static void main(String[] args){
        // Inintiate conversation
        commenceConsoleConvo();

    }

    // Main user input
    static void commenceConsoleConvo(){

        Scanner input = new Scanner(System.in);

        System.out.print("What is Your name?");
        String name = input.next();

        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String destination = input.nextLine();

        System.out.println("Great! Travelling to" + destination + "sounds like a great trip!");
        System.out.println("************");

        System.out.println("How many days are you going to be travelling?");
        int days = input.nextInt();
        
        System.out.println("how much money in USD, are you planning to spend on your trip?");
        int budget = input.nextInt();

        System.out.println("how many MXC are there in 1 USD?");
        double conversion = input.nextDouble();

    }

    // convert days to hours and minutes
    static void dayConversion() {   


    }

    // compute daily spend 
    static void dailySpend() {

    }

    // convert from 
    static void cashCoversion() {

    }

    static void commenceConsoleResponse() {
        System.out.println("If you are travelling for" + " " + "that is the same as" + "hours" + "or" + "minutes");
        System.out.println("If you are going to spend" + "budget" + "that means per day you can spend up to" +
        " daily spend");
        System.out.println("your total budget in MXC is"  +"convertedBudget" + "MXC, Which per day is " + 
        " convertedDailySpend" + "MXC");
        System.out.println("******");
    }

    static void timeDifference() {
        System.out.println("What is the time difference in hours, between your home and your destination?");
        int timeDiff = input.nextInt();

        computeTimeDiff();

        System.out.println("that means when it is midnight at home it will be" + "localTimeAM" + 
        "in your travel destination and when it is noon at home it will be" + "localTimePM");
        
        System.out.println("******");
    }

    static void computeTimeDiff(){


    }

    static void area(){
        System.out.println("What is the square root odf your destination country in km2?");
        double _area = input.nextDouble();

        // call area conversion method
        areaConversion(_area);

        System.out.println("in Miles2 that is " + "_areaConverted");
    }

    // takes area in km2 and converts to miles2
    static double areaConversion(double _areax) {
        double _areaConverted = x * 2.59;
        return _areaConverted;
    }


}
