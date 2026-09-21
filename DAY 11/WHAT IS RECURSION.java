Recursion = A function calling itself.

Every recursive function needs:

Base case → stops recursion
Recursive case → calls itself
  
Simple example
  
class Main {

    static void print(int n) {

        if (n == 0)
            return;

        System.out.println(n);

        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}

Output
5
4
3
2
1
  
Flow
  
print(5)
 ↓
print(4)
 ↓
print(3)
 ↓
print(2)
 ↓
print(1)
 ↓
print(0) → STOP
