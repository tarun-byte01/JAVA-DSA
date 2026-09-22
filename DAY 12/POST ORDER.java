Order:

LEFT → RIGHT → ROOT

Memory:

L → R → Root

Output:

40 50 20 30 10
Code
static void postorder(Node root) {

    if (root == null)
        return;

    postorder(root.left);

    postorder(root.right);

    System.out.print(root.data + " ");
} 
