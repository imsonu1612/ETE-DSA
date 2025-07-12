
import java.util.*;

// Node class
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class LevelOrderTraversal {

    // Function to perform level-order traversal
    public static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);  // Add root to the queue

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Remove and get the front node
            System.out.print(current.data + " "); // Print the node's value

            // Add left child to queue if exists
            if (current.left != null)
                queue.add(current.left);

            // Add right child to queue if exists
            if (current.right != null)
                queue.add(current.right);
        }
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Creating a binary tree:
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal:");
        levelOrder(root);  // Output: 1 2 3 4 5 6
    }
}
