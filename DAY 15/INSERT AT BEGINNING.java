Node newNode = new Node(5);

newNode.next = head;
head = newNode;

Before:

10 → 20 → 30

After:

5 → 10 → 20 → 30
Complexity

O(1)
