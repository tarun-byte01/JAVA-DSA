Order:

ROOT → LEFT → RIGHT

Memory:

Root → L → R

Output:

10 20 40 50 30
  
Code
  
static void preorder(Node root) {

    if (root == null)
        return;

    System.out.print(root.data + " ");

    preorder(root.left);

    preorder(root.right);
}
