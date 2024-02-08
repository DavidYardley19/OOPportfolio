import java.lang.reflect.Type;
import java.util.Scanner;

public class Week2LecturePractice
{

    public static void main(String[] args)
    {
        System.out.println("Hello");
        Week2LecturePractice objectName = new Week2LecturePractice();
        objectName.go();
    }

    //Class is the template
    // Static context resticts what you can do. You have to create an object of the class.
            // An object of itself to get around this.

    public void go()
    {
        System.out.println("Inside go");
        int age, fave_number = 23;
        // TODO: Need to figure out how to do this on the same line but have 2 diff values. Not tidy but interested.
        float my_float = 10.0123456789f;
        System.out.println(my_float);
        // Representation that a float can only have 7 decimal digits, is there a value when it can go to 8 decimal dig?
        double my_double = 10.01234567890123456789d;
        System.out.println(my_double);
        //15 decimal digits, but is there a value where you can reach 16 decimal digits... think of fractional powers of 2
        // TODO: Check out the above

        Scanner scan = new Scanner(System.in);
        // Typing this in will auto-gen the line at the top where it imports it.
        // TODO: Find out what System.in means, is this just the keyboard?

        //
        // TODO : MAKE SURE THE QUIZ IS DONE, I've already managed to complete the exercises.
        //

    }

}
