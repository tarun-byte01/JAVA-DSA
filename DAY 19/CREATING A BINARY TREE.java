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
        root.right = new Node(20);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.right = new Node(30);
    }
}
