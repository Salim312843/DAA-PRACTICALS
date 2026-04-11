import java.util.*;

public class SetOperations {
    public static void main(String[] args) {

        int[] S1 = {1, 2, 3, 4};
        int[] S2 = {3, 4, 5, 6};

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add elements of S1 to union
        for (int num : S1) {
            union.add(num);
        }

        // Store S1 elements in a set for intersection
        Set<Integer> set1 = new HashSet<>();
        for (int num : S1) {
            set1.add(num);
        }

        // Process S2
        for (int num : S2) {
            union.add(num); // Union

            if (set1.contains(num)) {
                intersection.add(num); // Intersection
            }
        }

        // Print results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
