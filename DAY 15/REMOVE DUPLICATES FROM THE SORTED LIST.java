Example:

1 → 1 → 2 → 3 → 3

Result:

1 → 2 → 3
Node temp = head;

while (temp != null && temp.next != null) {

    if (temp.data == temp.next.data) {
        temp.next = temp.next.next;
    } else {
        temp = temp.next;
    }
}
