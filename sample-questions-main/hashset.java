import java.util.*;

public class FriendlyHashSetExample {
public static void main(String[] args) {
Set<Integer> firstSet = new HashSet<>(Arrays.asList(11, 78, 90, 76, 56));
Set<Integer> secondSet = new HashSet<>(Arrays.asList(14, 78, 45, 98, 90));

    System.out.println("First Set: " + firstSet);
    System.out.println("Second Set: " + secondSet);

    Set<Integer> uniqueElements = new HashSet<>(firstSet);
    uniqueElements.removeAll(secondSet);

    System.out.println("Unique elements from the first set: " + uniqueElements);

    if (uniqueElements.isEmpty()) {
        System.out.println("No unique elements found in the first set!");
        return;
    }

    Optional<Integer> maxVal = uniqueElements.stream().max(Comparator.naturalOrder());
    Optional<Integer> minVal = uniqueElements.stream().min(Comparator.naturalOrder());

    if (maxVal.isPresent() && minVal.isPresent()) {
        int result = maxVal.get() + minVal.get();
        System.out.println("The Answer is: " + result);
    } else {
        System.out.println("Unable to determine max and min values.");
    }
}


}
