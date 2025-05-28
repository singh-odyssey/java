// performing insertion , deletion of everytype of node in a singly linked list and counting the nodes with searching and updating a node .
package linkedList.singular;

public class AllOpr {
    class Node {
        int data;
        Node nexNode;

        Node(int data) {
            this.data = data;
            this.nexNode = null;
        }
    }

    Node heaNode;

    public void createList(int[] array) {
        for (int i : array) {
            Node tempNode = new Node(i);
            if (heaNode == null) {
                heaNode = tempNode;
            } else {
                Node currNode = heaNode;
                while (currNode.nexNode != null) {
                    currNode = currNode.nexNode;
                }
                currNode.nexNode = tempNode;
            }
        }
    }

    public void insertAtFirst(int data) {
        Node tempNode = new Node(data);
        if (heaNode == null) {
            heaNode = tempNode;
        } else {
            tempNode.nexNode = heaNode;
            heaNode = tempNode;
        }
        this.traverse();
    }

    public void insertAtEnd() {

    }

    public void insertAtPos() {

    }

    public void deleteAtFirst() {

    }

    public void deleteAtEnd() {

    }

    public void deleteAtPos() {

    }

    public void searching() {

    }

    public void update() {

    }

    public int getCount() {
        return 0;
    }

    public void traverse() {
        Node currnNode = heaNode;
        while (currnNode != null) {
            System.out.print(currnNode.data + " -> ");
            currnNode = currnNode.nexNode;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        AllOpr list = new AllOpr();
        int[] array = { 1, 2, 3, 4, 5 };
        list.createList(array);
        list.traverse();
        list.insertAtFirst(0);
    }
}
