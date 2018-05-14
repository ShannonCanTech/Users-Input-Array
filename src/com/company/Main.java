package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Enter up to 5 numbers
        int[] inputArray = new int[5];
        Scanner scan = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Insert number: ");
                inputArray[i] = scan.nextInt();
                scan.nextLine();
            }


        System.out.println(adjacentElementsProduct(inputArray) + " is the highest number.");
    }


        public static int adjacentElementsProduct(int[] inputArray) {

            int product = inputArray[0];

            for (int i = 0; i < inputArray.length; i++) {

                if (inputArray[i] > product ){
                    product = inputArray[i];
                }
            }

            return product;
        }
}
