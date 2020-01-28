//1. Write a Java program to sort a numeric array .

import java.util.Scanner;

public class SortingNumericArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the size of numeric array :");
        int size=scanner.nextInt();

        int i,j;
        int[]number=new int[size];

        for(i=0;i<size;i++) // To take value of array elements
        {
            System.out.println("Please enter value for number["+i+"] :");
            number[i]=scanner.nextInt();
        }

        //To compare numbers so we can sort them from small to big
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                //logic for swapping two number
                if(number[i]>number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println("Numeric array after sorting in ascending order :");
        //to print array elements
        for(i=0;i<size;i++) {
            System.out.print(" "+number[i]);
        }

    }


}