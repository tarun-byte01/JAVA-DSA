Node slow = head;
Node fast = head;

while (fast != null && fast.next != null) {

    slow = slow.next;
    fast = fast.next.next;
}

System.out.println(slow.data);

Example:

10 → 20 → 30 → 40 → 50
              ↑
            middle

Output:

30
