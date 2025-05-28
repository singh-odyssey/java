// creating a linkedList using array 

package linkedList.singular;

public class LL2 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node heaNode;

    public void insert(int[] array) {
        for (int i : array) {
            Node tempNode = new Node(i);
            if (heaNode == null) {
                heaNode = tempNode;
            } else {
                Node currNode = heaNode;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = tempNode;
            }
        }
    }

    public void traverse() {
        Node currNode = heaNode;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        int[] array = { 1, 2, 3, 4, 5 };
        list.insert(array);
        list.traverse();
    }
}
