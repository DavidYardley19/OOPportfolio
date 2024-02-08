// 5) Fraction Write an application that prompts and reads the numerator and denominator of a fraction as integers
// and then prints the decimal equivalent of the fraction.

import java.util.Scanner;

public class Fraction
{
    public static void main(String[] args)
    {
        Fraction BasicFractionizer = new Fraction();
        BasicFractionizer.Compute_Fraction();
    }

    public void Compute_Fraction()
    {

        int numerator;
        int denominator;
        float decimal_fraction_equivelent;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numerator integer: ");
        numerator = scan.nextInt();

        System.out.print("Enter the denominator integer: ");
        denominator = scan.nextInt();

        decimal_fraction_equivelent = numerator / (float) denominator;
        // inspired by stack overflow, although I'm currently struggling to find this on w3schools

        System.out.println(decimal_fraction_equivelent);

    }

}
