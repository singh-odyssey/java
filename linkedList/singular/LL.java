// creating a linkedList 

package linkedList.singular;

class LL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void create(int n) {
        Node tempNode = new Node(n);
        if (head == null) {
            head = tempNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = tempNode;
        }
    }

    public void traverse() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.create(0);
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(4);
        list.create(5);
        list.traverse();
    }
}
