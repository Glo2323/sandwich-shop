package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {


    public static void main(String[] args) {

        //create a scanner

        Scanner sandwichSc = new Scanner(System.in);

        //Prompt the user for the size of the sandwich

        int regular = 1;
        int large = 2 ;

        System.out.println("""
                What size sandwich would you like
                1: Regular: base price $5.45
                2: Large: base price $8.95""");

        int sandwich = sandwichSc.nextInt();
        double sandwichPrice = 0;

        if (sandwich == 1){
            sandwichPrice = 5.45;

            System.out.printf("Price is $%.2f\n", sandwichPrice);
        }

        if (sandwich == 2){
            sandwichPrice = 8.95;

            System.out.printf("Price is $%.2f\n", sandwichPrice);
        }

        //Placeholder for enter
        String enter = sandwichSc.nextLine();


        //Prompt user if they would like loaded (yes/ no)
        System.out.println("Would you like your sandwich loaded (yes/no)");

        String sandwichLoaded = sandwichSc.nextLine();



        if (sandwichLoaded.equals("yes")){
            System.out.println("Would you like it regular or large");

            String sandwichLoadedSize = sandwichSc.nextLine();

            if (sandwichLoadedSize.equals("regular")){
                sandwichPrice = sandwichPrice + 1.00;

                System.out.println("You got a load sandwich");
            } else if (sandwichLoadedSize.equals("large")) {
                sandwichPrice = sandwichPrice + 1.75;

                System.out.println("You got a large load sandwich");
            }

        }

        //Prompt the user for their age
        System.out.println("Whats your age:");

        int age = sandwichSc.nextInt();

        double discount = 0;


        if (age <= 17){
            discount = .10;

            System.out.println("You received a 10% discount ");

        } else if (age >= 65) {
            discount = .20;

            System.out.println("You received a 20% discount" );

        }else{
            System.out.println("No discount applied.");
        }


        //Display the cost of the sandwich to the screen

        double costOfSandwich = sandwichPrice - (sandwichPrice * discount);

        System.out.printf("Your sandwich price is $%.2f\n", costOfSandwich);


    }
}
