import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list => ");
        int size = sc.nextInt();
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the String: ");
            listString.add(sc.next());
        }
        List<String> collectStringList = listString.stream().filter((e) -> e.length() % 3 == 0 || e.length() % 4 == 0)
                .collect(Collectors.toList());
        String stringJoiner = collectStringList.stream().collect(Collectors.joining("-")).toString();
        System.out.println("The ans is " + stringJoiner);
       
    }
}
