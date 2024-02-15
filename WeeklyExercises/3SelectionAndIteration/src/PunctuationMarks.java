/*
Design and implement a program that counts the number of punctuation marks in the following string
“Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went,
the lamb was sure to go. -that was a nice poem- the end. ”.
Produce a table that shows how many times each symbol occurred.
 */

import java.util.Scanner;

public class PunctuationMarks
{
/* IDEA:
    I could for loop between each character in the string
    Find the ASCII for each character then check if it's in a range between the lowest and highest
    This assumes that they are all in a row.

    Upon further inspection, it appears that there are 14 forms of punctuation.
    , > Comma
    ' > Apostrophe
    - > Hyphen, but there is also a "dash". This looks the same as a hyphen.
        ALT + 0151 produces a dash ... Does this mean that it may be more ideal to use unicode?
            It's not part of the ASCII set. Plus this uses the UTF-8 encoding system.
    ... > Ellipsis
    . > Full stop
    ! > Exclamation mark
    ? > Question mark
    () > Parenthesis
    [] > Brackets
    : > Colon
    ; > Semi-colon
    / > Slash
    "" > Quotation marks >>> I wonder if this counts as just one (for a set of two '"') or two...
        I will assume 2 despite their appearance coming as a due each time.
        TODO : Divide the quantity by 2 to show alternative answer.
     — > Dash as mentioned before.


 */

    public static void main(String[] args)
    {
        PunctuationMarks Sentance_Processor = new PunctuationMarks();
        Sentance_Processor.Compute_Punctuation();
    }

    public void Compute_Punctuation()
    {

        Scanner scan = new Scanner(System.in);
        String user_input;

        String[][] punctuation_array = new String[14][1];
        // There E 14 diff punctuation chars - consider this as the rows
        // the 1 indicates the number of columns, this will just be the count of each punctuation
        // Since you have declared this as a string array,
            // You will need to convert the count to a local int, increment the value then replace the prev one as a string!
                    // This seems a little shoddy. Thbere must be a better way of doing this.
                            // I feel it could be nice to look into nontheless.

        System.out.println("Please enter a sentance, I will compute how many of each punctuation there is.");
        user_input = scan.nextLine();

        // todo : Need to run a for loop in between the string for every character,
        //  use a switch statement to check if it is punctuation.. Then add this to an array

        // Useful line:
                //        for (int i = user_input.length() - 1; i >= 0; i--)
                //        {
                //            final_word = final_word + user_input.charAt(i);
                //        }


    }

}
