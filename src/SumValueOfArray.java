//Write a Java program to sum values of an array.

import java.util.Scanner;

public class SumValueOfArray {
    public static void main(String[] args) {
        int i;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of the Array : ");
        int size=scanner.nextInt();

        double[]a=new double[size];
        //to input value for array
        for(i=0;i<size;i++)
        {
            System.out.println("Please enter the value of a["+i+"] :");
            a[i]=scanner.nextDouble();
        }
        //to calculate sum of array values
        for(i=0;i<size;i++)
        {
            sum = sum + a[i];
        }

        System.out.println("Sum of the array values : "+sum);

    }
}
