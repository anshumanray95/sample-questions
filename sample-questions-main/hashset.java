import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class HashSetSolution {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        hs1.add(11);
        hs1.add(78);
        hs1.add(90);
        hs1.add(76);
        hs1.add(56);

        hs2.add(14);
        hs2.add(78);
        hs2.add(45);
        hs2.add(98);
        hs2.add(90);

        Set<Integer> resultantSet = hs1;
        resultantSet.removeAll(hs2);
        System.out.println(resultantSet);
        int max = resultantSet.stream().max(Comparator.naturalOrder()).get();
        int min = resultantSet.stream().min(Comparator.naturalOrder()).get();
        System.out.println("The Answer is : " + (max+min));
    }
}
