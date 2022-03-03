package operations.divide;

import java.util.Scanner;

public class DivideOperation {
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
        result = array[0] / array[1];
        System.out.println("The result of the subtract is: " + result);
    }
}
