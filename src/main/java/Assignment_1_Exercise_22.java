/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

import java.util.Scanner;
public class Assignment_1_Exercise_22 {
    public static boolean contain(int[] numbs, int x) {

        for (int n : numbs)

            if (n == x)
                // Return true if connection is successful
                return true;

        return false;

    }

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int[] numbs = new int[100];
        int count = 0;
        int largest = 0;

        while (count<3) { // Use while(count<3) to ensure user can enter maximum of three numbers.

            System.out.print("Enter any number (-1 to stop): ");

            int x = sc.nextInt();

            if (x == -1)

                break;

            //Will not allow same number enter twice
            if (contain(numbs, x)) {

                System.out.println("Number already entered. Please enter a different number!");

                continue;

            }

            numbs[count++] = x;

            largest = Math.max(x, largest);

        }

        //final output and result
        System.out.println("The largest number is " + largest);

        sc.close();

    }

}

