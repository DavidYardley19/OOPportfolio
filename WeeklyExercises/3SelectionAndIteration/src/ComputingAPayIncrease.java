/* File Salary.java contains most of a program that takes as input an employee's salary and a rating of the employee's
 performance and computes the raise for the employee. The performance rating here is being entered as a String—the three
 possible ratings are "Excellent", "Good", and "Poor". An employee who is rated excellent will receive a 6% raise,
 one rated good will receive a 4% raise, and one rated poor will receive a 1.5% raise.

 Add the if... else... statements to program Salary to make it run as described above.
 Note that you will have to use the equals method of the String class
 (not the relational operator ==) to compare two strings. */

/*
Writing this to gain an understanding:
Takes inputs: employee salary, performance rating (excellent:6pc/ good:4pc / poor:1.5pc)
Computes raise... Add if else statement for this.
"use the equals method" - What in the SILVER SPOON is this...
 */

// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************

/*
Idea:
    Use a switch statement to differenciate between "Excellent", "Good", and "Poor".
    In reference to big-O notation, I'm unsure how effective a switch statement is in comparison to another method.
        TODO: Once all tasks are complete, check into the java documentation to discover how the switch statement works.
 */

import java.util.Scanner;
import java.text.NumberFormat;


public class ComputingAPayIncrease
{
    public static void main (String[] args)
    {
        double currentSalary;  // employee's current  salary
        double raise = 0;          // amount of the raise
        double newSalary;      // new salary for the employee
        String rating;         // performance rating

        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();

        if (rating.equals("Excellent"))
        {
            raise = CalculateRaise(0.06, currentSalary);
        }
        else if (rating.equals("Good"))
        {
            raise = CalculateRaise(0.04, currentSalary);
        }
        else if (rating.equals("Poor"))
        {
            raise = CalculateRaise(0.015, currentSalary);
        }
        // TODO 1: Would rather use a switch statement for this... but create another outcome to handle erronious input.
        // TODO 2: Create a seperate function to handle the repeated code for calculating raises.
            // DONE

        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();
    }

    static public double CalculateRaise(double raise_percentage, double user_salary)
    {
        return user_salary * raise_percentage;
    }

}