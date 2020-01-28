//6. WAP to input any 3 digit number and check if it is Armstrong number or not

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum=0;
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any three digit number:");
        int number = scanner.nextInt();
        int temp=number;
//to check number is armstrong number or not by finding cube of each digit and adding them
        while(number>0)
        {
            digit = number % 10;
            number=number/10;
            int cube = digit * digit * digit;
            sum =sum + cube;
        }

//to compare the numbers
            if (sum == temp)
                System.out.println("Given number "+temp+" is armstrong number.");
            else
                System.out.println("Given number "+temp+" is not an armstrong number.");

    }
}
