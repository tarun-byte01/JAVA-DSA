Input:

[1, 2, 2, 3, 1, 1]

Output:

1 → 3
2 → 2
3 → 1
Code
import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);
    }
}
Most important line
map.put(x, map.getOrDefault(x, 0) + 1);

Remember this for coding tests.
