Operation	Meaning
push()	Add element
pop()	Remove top
peek()	See top
isEmpty()	Check empty
size()	Number of elements
Java

For coding tests, ArrayDeque is a good choice:

Stack<Integer> s = new Stack<>();

s.push(10);
s.push(20);
s.push(30);

System.out.println(s.peek()); // 30

s.pop();

System.out.println(s.peek()); // 20
