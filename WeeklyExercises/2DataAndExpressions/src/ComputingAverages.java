// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************

import java.util.Scanner;

public class ComputingAverages
{
        public static void main(String[] args)
        {
            int val1, val2, val3;
            double average;
            Scanner scan = new Scanner(System.in) ;

            // get three values from user
            System.out.println("Please enter three integers and " +
                    "I will compute their average");
            
            System.out.println("Enter the first integer: ");
            val1 = scan.nextInt();

            System.out.println("Enter the second integer: ");
            val2 = scan.nextInt();

            System.out.println("Enter the third integer: ");
            val3 = scan.nextInt();

            average = (val1 + val2 + val3) / 3f;
            // Turns out I just needed an f after the 3 for it to output a float.

            System.out.println("The average is: " + average);

        }

}

