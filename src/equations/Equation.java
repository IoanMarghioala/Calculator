package equations;

import java.util.Arrays;
import java.util.List;

public class Equation {
    public static void main(String[] args) {
        if (args.length == 3) {
            int firstNumber = 0;
            int secondNumber = 0;
            try{
                firstNumber = Integer.parseInt(args[0]);
                secondNumber = Integer.parseInt(args[2]);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Unul dintre parametrii nu este numar");
            }
            int result = 0;
            String commandOperator = args[1];
            List<String> operators = Arrays.asList("+","-","*","/");
            if (operators.stream().anyMatch(operator -> operator.equals(commandOperator))) {
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
                            System.out.println("Nu se poate efectua impartirea la 0");
                        }
                        break;
                }
            }
            if(result != 0){
                System.out.println(result);
            }
        }
    }
}

