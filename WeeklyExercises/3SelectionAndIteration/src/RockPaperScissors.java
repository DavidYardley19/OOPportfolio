/*
Program Rock.java contains a skeleton for the game Rock, Paper, Scissors.
Add statements to the program as indicated by the comments so that the program asks the user to enter a play,
generates a random play for the computer, compares them and announces the winner (and why).

Note that the user should be able to enter either upper or lower case r, p, and s.
The user's play is stored as a string to make it easy to convert whatever is entered to upper case.
Use a switch statement to convert the randomly generated integer for the computer's play to a string.
 */

// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        //computer's play


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();


        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        switch (computerInt)
        {


        }


        //Print computer's play
        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else


        //...  Fill in rest of code
    }
}