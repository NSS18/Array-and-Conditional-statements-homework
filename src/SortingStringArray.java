//1. Write a Java program to sort a  String array.
import java.util.Scanner;

public class SortingStringArray {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the size of String array :");
        int size=scanner.nextInt();

        int i,j;
        String[]word=new String[size];

        for(i=0;i<size;i++) // To take value of string array elements
        {
            System.out.println("Please enter value for string["+i+"] (Without any Space):");

            word[i]=scanner.next();

        }

        //To compare string so we can sort in alphabetical order
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                //to compare strings on the basis of Unicode value of each character in the string.
                if(word[i].compareTo(word[j])>0 )
                {
                    String temp = word[i];
                    word[i]=word[j];
                    word[j]=temp;
                }

            }
        }
        System.out.println("String array in ascending order:");

        //To print sorted string array
        for(i=0;i<size;i++)
        {
            System.out.print(" "+word[i]);
        }


    }
}
