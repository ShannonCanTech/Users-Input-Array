package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Enter up to 5 numbers
        boolean done = false;
        int[] inputArray = {1, 4, -6, 5, 8};
/*        int product = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] > product ){
                product = inputArray[i];
            }
        }
        adjacentElementsProduct(inputArray);*/

        System.out.println(adjacentElementsProduct(inputArray) + " is the highest number.");

/*        Scanner scan = new Scanner(System.in);

        do {
            for (int x = 0; x < 5; x++) {
                System.out.println("Create an array: ");
                input = scan.nextInt();
                input.add(inputArray[input]);
                scan.nextLine();
            }
        } while (!done);
        adjacentElementsProduct(inputArray);*/
    }


        public static int adjacentElementsProduct(int[] inputArray) {

            int product = inputArray[0];

            for (int i = 0; i < inputArray.length; i++) {

                if (inputArray[i] > product ){
                    product = inputArray[i];
                }
            }

            return product;

/*            //product means multiplying
            int x =  inputArray.length(); //the array is x long
            //which of these numbers in the array produces the greatest number

            //prints each number in the array while looping
            for (int i = 0; i <= inputArray.length(); i++) {
                inputArray[i];
            }
            return i * x;*/
        }
}
