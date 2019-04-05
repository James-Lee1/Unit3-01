/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program accepts a string and reverses it
 *
 ****************************************************************************/

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a string to reverse! : ");

        // Shows string in reverse
        String textToReverse = userInput.nextLine();
        System.out.print("String in reverse is : " + stringReverse(textToReverse));
    }

    // Function that reverses string
    private static String stringReverse(String s)
    {
        char lastChar;
        String reversedString = "";
        String substring;

        // If nothing is left in original string to remove
        if (s.length() <= 0)
        {
            return s;
        }

        // Continuosly removes a char from string, and adds to new string
        else
        {
            // Takes everything but the last character of string and stores it
            substring = s.substring(0, s.length() - 1);

            // Takes last char of string
            lastChar = s.charAt(s.length() - 1);

            // Adds last char of string first, then sends the rest back into function
            // to find the last char of substring
            reversedString += lastChar + stringReverse(substring);
            return reversedString;
        }
    }
}


