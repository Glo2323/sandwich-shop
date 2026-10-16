package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {


    public static void main(String[] args) {

        //create a scanner

        Scanner sandwichSc = new Scanner(System.in);

        //Prompt the user for the size of the sandwich

        int regular = 1;
        int large = 2 ;

        System.out.println("What size sandwich would you like 1 for regular, 2 for large: ");

        int sandwich = sandwichSc.nextInt();
        double regularBasePrice = 5.45;
        double largeBasePrice = 8.95;

        if (sandwich == 1){
            System.out.printf("Price is $%.2f\n", regularBasePrice);
        }

        if (sandwich == 2){
            System.out.printf("Price is $%.2f\n", largeBasePrice);
        }



        //Prompt the user for their age
        System.out.println("Whats your age:");



        int age = sandwichSc.nextInt();

        if (age >= 17){
            System.out.println();

        }




        //Display the cost of the sandwich to the screen


    }
}
