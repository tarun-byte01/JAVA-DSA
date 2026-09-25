Delete First Node ⭐
head = head.next;

Before:

10 → 20 → 30

After:

20 → 30
Complexity

O(1)

6. Delete Last Node ⭐
Node temp = head;

while (temp.next.next != null) {
    temp = temp.next;
}

temp.next = null;

Before:

10 → 20 → 30

After:

10 → 20 → null
Complexity

O(n)
