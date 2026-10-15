class Main {

    static int firstPosition(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                if (arr[mid] == target) {
                    answer = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    static int lastPosition(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    answer = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        System.out.println(
            "[" + firstPosition(arr, target) + ", "
                + lastPosition(arr, target) + "]"
        );
    }
}
