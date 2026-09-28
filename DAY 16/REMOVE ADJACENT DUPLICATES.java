import java.util.*;

class Main {
    public static void main(String[] args) {

        String s = "abbaca";

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        System.out.println(ans.reverse());
    }
}
