import java.util.Scanner;

public class MilesToKilometers
{
    public static void main(String[] args)
    {
        MilesToKilometers Converter = new MilesToKilometers();
        Converter.Process();
    }

    public void Process()
    {
        float miles;
        float kilometers;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number of miles: ");
        miles = scan.nextFloat();

        kilometers = miles * 1.60935f;

        System.out.println("This is equal to: " + kilometers + " Km");

    }

}
