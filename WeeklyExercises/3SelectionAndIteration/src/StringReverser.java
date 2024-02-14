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
        String final_sentance = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentance below, I will reverse it!");
        user_input = scan.nextLine();

        String[] words = user_input.split("\\s+");
        for (String word : words)
        {
            final_sentance = final_sentance + ConvertWord(word) + " ";
        }

        System.out.println(final_sentance.substring(0, final_sentance.length() - 1));
    }

    public String ConvertWord(String user_input_word)
    {
        String final_word = "";

        for (int i = user_input_word.length() - 1; i >= 0; i--) {
            final_word = final_word + user_input_word.charAt(i);
        }

        return final_word;
    }

    // TODO: This is NOT done, you need to reverse each word in the string David. Not the entire string!
    //  But !! You can use this method after splitting the string into different words in succession - This is useful!

}
