import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

```
    try {
        System.out.print("Enter an operation (e.g., 3+5): ");
        String expression = scanner.nextLine();

        // Check if the input format is correct
        if (expression.length() != 3) {
            throw new IllegalArgumentException("Please enter in the correct format, like 3+5.");
        }

        char operator = expression.charAt(1);
        int firstNum = Character.getNumericValue(expression.charAt(0));
        int secondNum = Character.getNumericValue(expression.charAt(2));
        int result;

        // Perform operation based on the operator
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    throw new ArithmeticException("You can’t divide by zero!");
                }
                result = firstNum / secondNum;
                break;
            default:
                throw new IllegalArgumentException("Unsupported operator. Use +, -, *, or /.");
        }

        System.out.println("Result: " + result);

    } catch (ArithmeticException e) {
        System.out.println("Oops! " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid input: " + e.getMessage());
    } finally {
        scanner.close();
        System.out.println("Calculator closed. Thanks for using it!");
    }
}
```

}
