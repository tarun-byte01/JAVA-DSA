HashMap stores key-value pairs.

HashMap<Integer, String> map = new HashMap<>();

Example:

import java.util.*;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Tarun");
        map.put(102, "Rahul");
        map.put(103, "Arun");

        System.out.println(map.get(101));
    }
}

Output:

Tarun
