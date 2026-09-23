import java.util.*;

class Main {

    static void permute(int[] arr,
                        boolean[] used,
                        ArrayList<Integer> list) {

        if (list.size() == arr.length) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i])
                continue;

            // Choose
            used[i] = true;
            list.add(arr[i]);

            // Explore
            permute(arr, used, list);

            // Undo
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        permute(arr,
                new boolean[arr.length],
                new ArrayList<>());
    }
}
