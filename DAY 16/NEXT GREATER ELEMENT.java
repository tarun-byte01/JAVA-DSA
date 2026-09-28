import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10};

        for (int i = 0; i < arr.length; i++) {

            int ans = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    ans = arr[j];
                    break;
                }
            }

            System.out.print(ans + " ");
        }
    }
}
