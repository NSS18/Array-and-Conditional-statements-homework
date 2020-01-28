
//3. Write a Java program to test if an array contains a specific value

import java.util.Scanner;

public class TestSpecificValue {
    public static void main(String[] args) {
        boolean found=false;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the size for numeric array :");
        int size=scanner.nextInt();

        int i;
        int[]value=new int[size];

        for(i=0;i<size;i++) // To take value of array elements from user
        {
            System.out.println("Please enter value for number["+i+"] :");
            value[i]=scanner.nextInt();
        }

        System.out.println("Please enter specific value,which you would like to test : ");
        int svalue=scanner.nextInt();

        //To check specific value matching with array values
        for(i=0;i<size;i++)
        {
            if (value[i] == svalue)
                found = true;
        }
        //to print value found or not
        if(found)
            System.out.println(svalue+" is found in the array.");
        else
            System.out.println(svalue+" is not found in the array");





    }
}
