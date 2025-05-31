// creating a binary search tree 
// using level order traversal
package tree;

public class Prac {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class binarySTree {
        public static Node insert(Node root, int data) {
            if (root == null)
                return new Node(data);
            if (data < root.data)
                root.leftNode = insert(root.leftNode, data);
            else
                root.rightNode = insert(root.rightNode, data);
            return root;
        }
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.leftNode) + size(root.rightNode);
    }

    public static void levelTraverse(Node root) {
        if (root == null) {
            return;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if (current.leftNode != null) {
                    queue.add(current.leftNode);
                }
                if (current.rightNode != null) {
                    queue.add(current.rightNode);
                }
            }
            System.out.println();
        }
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int sumLeft = sum(root.leftNode);
        int sumRight = sum(root.rightNode);

        return sumLeft + sumRight + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = height(root.leftNode);
        int heightRight = height(root.rightNode);

        if (heightRight > heightLeft) {
            return heightRight + 1;
        } else {
            return heightLeft + 1;
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 3, 6, 9, 4, 7, 10 };
        Node root = null;
        for (int val : array) {
            root = binarySTree.insert(root, val);
        }
        levelTraverse(root);
        System.out.println();
        System.out.println("size -> " + size(root));
        System.out.println("sum -> " + sum(root));
        System.out.println("Height -> " + height(root));
    }
}