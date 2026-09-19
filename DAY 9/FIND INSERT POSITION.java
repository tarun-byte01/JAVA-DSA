Example:

arr = [1, 3, 5, 6]
target = 4

4 should be inserted at index 2.

This is LeetCode 35.

Simple code
int left = 0;
int right = arr.length - 1;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (arr[mid] == target)
        return mid;
    else if (arr[mid] < target)
        left = mid + 1;
    else
        right = mid - 1;
}

return left;
