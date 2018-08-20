package sortednumber;

import java.util.Arrays;
import java.util.Scanner;

// دریافت و آن ها را به صورت صعودی نمایش دهدdouble سه عدد از نوع 

public class SortedNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers ...");

        displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double[] sort = {num1, num2, num3};
        Arrays.sort(sort);

        System.out.println("Numbers in increasing order\n");
        for (int i = 0; i < sort.length; i++) {

            System.out.println(sort[i]);

        }

    }

}
