Example:

1 + 2 + 3 + 4 + 5 = 15
Code
static int sum(int n) {

    if (n == 0)
        return 0;

    return n + sum(n - 1);
}
sum(5)
= 5 + sum(4)
= 5 + 4 + sum(3)
= 5 + 4 + 3 + 2 + 1
= 15
