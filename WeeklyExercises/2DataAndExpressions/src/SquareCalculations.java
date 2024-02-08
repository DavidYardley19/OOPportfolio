/*
Write an application that prompts for and reads integer representing the length of a square’s side,
        then prints the square’s perimeter and area.
*/

import java.util.Scanner;

public class SquareCalculations
{
    public static void main(String[] args)
    {
        SquareCalculations Calculator = new SquareCalculations();
        Calculator.Process();
    }

    public void Process()
    {

        float side_length;
        float perimiter;
        float area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the length of the squares side: ");
        side_length = scan.nextFloat();

        perimiter = side_length * 4f;
        area = side_length * side_length;

        System.out.println("Perimeter = " + perimiter);
        System.out.println("Area = " + area);

    }
}
