import java.util.Scanner;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the phone number: ");
            String input = sc.next();

            if (input.length() < 10) {
                throw new IllegalArgumentException("You have entered less than 10 digits.");
            } else if (input.length() > 10) {
                throw new IllegalArgumentException("You have entered more than 10 digits.");
            }

            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("You have entered a character instead of a digit.");
                }
            }

            System.out.println("Valid mobile phone number: " + input);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
