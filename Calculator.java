import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an operator: +, -, * or /");
        if (!input.next().equals("+") && !input.next().equals("-") && !input.next().equals("*") && !input.next().equals("/")) {
            throw new IllegalArgumentException("Invalid Input: Please input an operator");
        } else {
            char operator = input.next().charAt(0);
            System.out.println("Enter your first number");
            if (input.hasNextDouble()) {
                Double n1 = input.nextDouble();
                System.out.println("Enter your second number");
                if (input.hasNextDouble()) {
                    Double n2 = input.nextDouble();
                    Double result;
                    switch (operator) {
                        case '*':
                            result = n1 * n2;
                            System.out.println("Result: " + n1 + " * " + n2 + " = " + result);
                            break;
                        case '+':
                            result = n1 + n2;
                            System.out.println("Result: " + n1 + " + " + n2 + " = " + result);
                        case ',':
                        case '.':
                        default:
                            break;
                        case '-':
                            result = n1 - n2;
                            System.out.println("Result: " + n1 + " - " + n2 + " = " + result);
                            break;
                        case '/':
                            result = n1 / n2;
                            System.out.println("Result: " + n1 + " / " + n2 + " = " + result);
                    }

                    input.close();
                } else {
                    throw new IllegalArgumentException("Invalid Input: Please input a number");
                }
            } else {
                throw new IllegalArgumentException("Invalid Input: Please input a number");
            }
        }
    }
}
