Order:

LEFT → ROOT → RIGHT

Memory:

L → Root → R

For:

        10
       /  \
      20   30
     / \
    40  50

Output:

40 20 50 10 30
  
Code
  
static void inorder(Node root) {

    if (root == null)
        return;

    inorder(root.left);

    System.out.print(root.data + " ");

    inorder(root.right);
}
