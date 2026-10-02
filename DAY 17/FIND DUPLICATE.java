import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x)) {
                System.out.println("Duplicate: " + x);
                return;
            }

            set.add(x);
        }
    }
}
