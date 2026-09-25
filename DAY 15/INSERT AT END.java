Node newNode = new Node(40);

Node temp = head;

while (temp.next != null) {
    temp = temp.next;
}

temp.next = newNode;

Before:

10 → 20 → 30

After:

10 → 20 → 30 → 40
Complexity

O(n)
