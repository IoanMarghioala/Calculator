package equations;

import java.util.Arrays;
import java.util.List;

public class Equation {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        String commandOperator = args[1];

        if (args.length != 3) {
            System.exit(0);
            System.out.println("You need to introduce 3 parameters.");
        }

        if (!checkIfOperatorIsCorrect(commandOperator)) {
            System.exit(0);
            System.out.println("Your parameters is not correct");
        }

        if (checkIfParametersAreNumbers(args[0]) && checkIfParametersAreNumbers(args[2])) {
            firstNumber = Integer.parseInt(args[0]);
            secondNumber = Integer.parseInt(args[2]);
        }

        switch (commandOperator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("You can't divide by 0.");
                }
                break;
        }
        printResult(result);
    }

    private static void printResult(int result) {
        if (result != 0) {
            System.out.println(result);
        }
    }

    public static boolean checkIfOperatorIsCorrect(String operator) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        if (operators.stream().anyMatch(op -> op.equals(operator))) {
            return true;
        } else {
            System.out.println("Your parameters is not correct");
            return false;
        }
    }

    public static boolean checkIfParametersAreNumbers(String string) {
        if (string == null) {
            System.out.println("Your input is null");
        }else {
            try {
                Integer.parseInt(string);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Your parameter is not a number");
                System.exit(0);
                return false;
            }
        }
        return false;
    }
}
