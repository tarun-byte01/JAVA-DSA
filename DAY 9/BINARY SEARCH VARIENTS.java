Variant 1 — First Occurrence

Find the first position of a target when duplicates exist.

[1, 2, 2, 2, 3, 4]
       ↑
First 2 = index 1
Code
int left = 0, right = arr.length - 1;
int ans = -1;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (arr[mid] == target) {
        ans = mid;
        right = mid - 1;
    }
    else if (arr[mid] < target) {
        left = mid + 1;
    }
    else {
        right = mid - 1;
    }
}
