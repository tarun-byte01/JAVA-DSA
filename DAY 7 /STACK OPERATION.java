Stack<Integer> stack = new Stack<>();

stack.push(10);       // Add
stack.push(20);
stack.push(30);

System.out.println(stack.peek());    // 30

stack.pop();                         // Remove 30

System.out.println(stack.isEmpty()); // false
System.out.println(stack.size());    // 2
