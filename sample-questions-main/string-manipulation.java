import java.util.*;
import java.util.stream.Collectors;

public class FriendlyStringManipulation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.print("How many strings would you like to enter? => ");
    int size = scanner.nextInt();
    scanner.nextLine();

    List<String> inputStrings = new ArrayList<>();
    for (int i = 0; i < size; i++) {
        System.out.print("Enter string " + (i + 1) + ": ");
        inputStrings.add(scanner.nextLine());
    }

    List<String> filteredStrings = inputStrings.stream()
            .filter(s -> s.length() % 3 == 0 || s.length() % 4 == 0)
            .collect(Collectors.toList());

    String joinedString = filteredStrings.stream()
            .collect(Collectors.joining("-"));

    if (filteredStrings.isEmpty()) {
        System.out.println("No strings found with a length divisible by 3 or 4.");
    } else {
        System.out.println("Filtered and joined result: " + joinedString);
    }

    scanner.close();
    System.out.println("✅ String manipulation complete. Thanks for trying!");
}

}
