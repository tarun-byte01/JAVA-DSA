Example:

2³ = 2 × 2 × 2 = 8
Code
static int power(int a, int n) {

    if (n == 0)
        return 1;

    return a * power(a, n - 1);
}
