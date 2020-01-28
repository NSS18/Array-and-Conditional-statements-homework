//9. WAP to enter any String and count total number of 'a' in that String.

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        int i;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the string");
        String str =scanner.nextLine();

        int length= str.length();
        //to check char matches with 'a'
        for(i=0;i<length;i++)
        {
            if(str.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println("number of 'á' in entered string is : "+count);
    }
}
