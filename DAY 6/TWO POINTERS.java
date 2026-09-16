Two Pointers
What is it?

Two Pointers means using two variables/indexes to move through an array or string.

Usually:

int left = 0;
int right = arr.length - 1;

Then move:

left++;
right--;
Main idea 🧠
LEFT → → →       ← ← ← RIGHT

Instead of checking every possible pair with nested loops, we use two pointers.
