/*7. Printing multiplication table till n using do while loop (value of n will come
through scanner class)
1 2 3
2 4 6
3 6 9
 */

import java.util.Scanner;

public class MultiplicationTableUsingDoWhile {
    public static void main(String[] args) {
        int row = 1;
        int col, mul;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter up to which number you would like to print timetable:\n");
        int n=scanner.nextInt();

        System.out.println("Multiplication table: ");


        do {
            col = 1;
            //to find and print multiplication
            do {
                mul = row * col;
                System.out.print(" " + mul);
                col = col + 1;
            }

            while (col <= n); //to go up to n(specified size) column
            System.out.print("\n");
            row = row + 1;
        }
        while (row<=n);//to go up to n(specified size) row
        }
    }
