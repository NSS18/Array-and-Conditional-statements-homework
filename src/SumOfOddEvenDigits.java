/*4. WAP to input any five digit number then count total no of odd and even digit
        and find sum of them

 */

import java.util.Scanner;

public class SumOfOddEvenDigits {
    public static void main(String[] args) {
        int i;
        int evencount=0;
        int oddcount=0;
        int sumeven=0;
        int sumodd=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any five digit number:");
        int number=scanner.nextInt();
        int temp=number;


        while(number>0) //checks number is grater then 0
        {
        int digit = number%10;

        // To check number is even or odd and then to  find sum
        if(digit%2==0)
        {
            evencount++;
            sumeven=sumeven+digit;
        }
        else{
            oddcount++;
            sumodd=sumodd+digit;
        }


        number=number/10;
        }
        System.out.println("Total number of even digits in "+temp+" : "+evencount);
        System.out.println("Total number of odd digits in "+temp+" :"+oddcount);
        System.out.println("Sum of odd digits is: "+sumodd);
        System.out.println("Sum of even digits is: "+sumeven);

    }
}
