Visits nodes level by level.

        10
       /  \
      20   30
     / \
    40  50

Output:

10 20 30 40 50

Use a Queue.

Code
import java.util.*;

static void levelOrder(Node root) {

    if (root == null)
        return;

    Queue<Node> q = new LinkedList<>();

    q.add(root);

    while (!q.isEmpty()) {

        Node current = q.remove();

        System.out.print(current.data + " ");

        if (current.left != null)
            q.add(current.left);

        if (current.right != null)
            q.add(current.right);
    }
}
Memory trick
Inorder   → L Root R
Preorder  → Root L R
Postorder → L R Root
Level     → Queue
