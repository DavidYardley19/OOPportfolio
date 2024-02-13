/*
Write a small program that prompts the user for a sentence and then outputs the same sentence with the characters
in each word reversed. For example, if the user enters “This is a sample sentence.”
then the output would be “sihT si a elpmas .ecnetnes.”
Note the use of multiple Scanner objects may be helpful with this program.
 */

import java.util.Scanner;
public class StringReverser
{
/*
Easy to understand method:
    Write a for loop from the end of the string to the start of the string,
    create a new string where you keep adding the next letter in the for loop. Et voila.
    Is it the most effective, or smallest ammount of code?
        Probably not. There must exists a library that cn already do all that for you.
        TODO: If complete, look into how you can find a library to do all this for you.
        This will assist in one way, however work the "Algorithm" out first.
            Makes me a little sick to call it an algorithm but hey ho.
 */

    public static void main(String[] args)
    {
        StringReverser StrReverse = new StringReverser();
        StrReverse.ConvertString();
    }

    public void ConvertString()
    {
        String user_input;
        String reversed_str;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentance below, I will reverse it!");
        user_input = scan.nextLine();

        for (int i = user_input.length() - 1; i >= 0; i--) {
            System.out.print(user_input.charAt(i));
        }
    }
}