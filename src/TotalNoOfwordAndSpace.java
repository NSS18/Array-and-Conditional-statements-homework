/*10. WAP to enter any String and count how many total number of words and total
number of spaces in that sentence.
 */

import java.util.Scanner;

public class TotalNoOfwordAndSpace
{
    public static void main(String[] args) {
        int i,j;
        int space=0;
        int word;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the string");
        String str =scanner.nextLine();

        //The split method gives the length of array which gives number of words in given String.

        String[] words = str.split("\\s+");//regular expression "\\s+" to split the String on whitespace
        word=words.length;
        System.out.println("Total words in string: "+word);
        int length= str.length();
        //to count space
        for(i=1;i<length;i++)
        {
            if(str.charAt(i)==' ')
                space++;

        }
        System.out.println("Total number of space in entered string : "+space);







    }
}
