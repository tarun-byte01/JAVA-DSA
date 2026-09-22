class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);
    }
}

Tree:

        10
       /  \
      5    15
     / \
    2   7
