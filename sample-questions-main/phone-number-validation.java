import java.util.Scanner;

public class FriendlyPhoneNumberValidator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Please enter your 10-digit phone number: ");
        String phone = scanner.nextLine().trim();

        if (phone.length() < 10) {
            throw new IllegalArgumentException("Oops! That looks short — phone numbers must have exactly 10 digits.");
        } else if (phone.length() > 10) {
            throw new IllegalArgumentException("That’s too long — phone numbers should only have 10 digits.");
        }

        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new IllegalArgumentException("Invalid input — only digits are allowed in a phone number.");
            }
        }

        System.out.println("✅ Valid mobile number: " + phone);
    } 
    catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    } 
    finally {
        scanner.close();
        System.out.println("Thank you for using the phone number validator!");
    }
}

}
