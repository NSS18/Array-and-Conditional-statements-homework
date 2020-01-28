//5. WAP to input any five digit number and then reverse the number

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reversenumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any five digit number:");
        int number = scanner.nextInt();
        int temp =number;

        System.out.print("Reverse number of "+temp+" is: ");
        //to print reverse number
            while (number > 0)
            {
                reversenumber = number % 10;
                System.out.print(reversenumber);
                number = number / 10;
            }
            //if number is 0
            if(temp==0)
            {
                System.out.println(temp);
            }




    }
}