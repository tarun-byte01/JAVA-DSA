Example:

[10, 20, 30, 40, 50, 60, 70]

Target = 60

Step 1
left = 0
right = 6

mid = 3
arr[mid] = 40

60 > 40 → search right side.

Step 2
left = 4
right = 6

mid = 5
arr[mid] = 60

Found ✅

Binary Search Code ⭐⭐⭐
class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}
Output
Found at index 5
