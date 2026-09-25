int key = 20;
Node temp = head;

while (temp != null) {

    if (temp.data == key) {
        System.out.println("Found");
        return;
    }

    temp = temp.next;
}

System.out.println("Not Found");
