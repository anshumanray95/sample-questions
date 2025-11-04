import java.util.Scanner;

public class ExceptionHandlingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the input: ");
            String input = sc.next();


            if (input.length() != 3) {
                throw new IllegalArgumentException("Invalid operation");
            }

            char operator = input.charAt(1);
            int num1 = Character.getNumericValue(input.charAt(0));
            int num2 = Character.getNumericValue(input.charAt(2));


            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':

                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    System.out.println(num1 / num2);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation");
            }
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}
