A Binary Tree is a tree where each node has at most 2 children:

left
right
  
Node structure
  
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
