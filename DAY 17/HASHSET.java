HashSet stores unique values.

HashSet<Integer> set = new HashSet<>();

Example:

import java.util.*;

class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}

Output contains only:

[10, 20]
