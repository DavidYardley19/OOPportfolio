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
            float val1AsFlaot, val2AsFlaot, val3AsFlaot;
            double average;
            Scanner scan = new Scanner(System.in) ;

            // get three values from user
            System.out.println("Please enter three integers and " +
                    "I will compute their average");
            
            System.out.print("Enter the first integer: ");
            val1 = scan.nextInt();
            val1AsFlaot = val1;

            System.out.print("Enter the second integer: ");
            val2 = scan.nextInt();
            val2AsFlaot = val2;

            System.out.print("Enter the third integer: ");
            val3 = scan.nextInt();
            val3AsFlaot = val3;

            average = (val1 + val2 + val3) / 3d;
            // Turns out I just needed an f after the 3 for it to output a float.
            // This f has been amended to a d due to issues with accuracy.

            System.out.println("The average is: " + average);

        }

}

