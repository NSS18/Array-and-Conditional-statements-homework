//8. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int no1 = 0;
        int no2 = 1;
        int i, no3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to "+n+" number is--->");
        System.out.print(no1 + " " + no2);

        //to print fibonacci series
        for (i = 2; i < n; ++i)
        {
            no3 = no1 + no2;
            System.out.print(" " + no3);
            no1 = no2;
            no2 = no3;
        }


    }

    }


