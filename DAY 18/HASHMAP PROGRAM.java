import java.util.*;

class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tarun", 90);
        map.put("Arun", 80);
        map.put("John", 95);

        System.out.println(map.get("Tarun"));

        System.out.println(map.containsKey("Arun"));

        map.remove("John");

        System.out.println(map);
    }
}
