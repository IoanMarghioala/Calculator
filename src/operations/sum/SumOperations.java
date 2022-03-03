package operations.sum;

import java.util.Scanner;

public class SumOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int index = 0;
        int[] array = new int[2];
        while (index != 2) {
            try {
                array[index] = Integer.parseInt(scanner.nextLine());
                index++;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("The input you entered is not a number");
            }
        }
        for (int eachNumber : array) {
            result += eachNumber;
        }
        System.out.println("The result of the sum is: " + result);
    }
}