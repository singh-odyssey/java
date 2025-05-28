// performing insertion , deletion of everytype of node in a singly linked list and counting the nodes with searching and updating a node .
package linkedList.singular;

import java.util.Scanner;

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

    public void insertAtEnd(int data) {
        Node tempNode = new Node(data);
        if (heaNode == null) {
            heaNode = tempNode;
        } else {
            Node currNode = heaNode;
            while (currNode.nexNode != null) {
                currNode = currNode.nexNode;
            }
            currNode.nexNode = tempNode;
        }
        this.traverse();
    }

    public void insertAtPos(int data, int pos) {
        Node tempNode = new Node(data);
        if (pos < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }
        if (pos == 0) {
            insertAtFirst(data);
            return;
        }
        if (heaNode == null) {
            System.out.println("List is empty, inserting at position 0.");
            insertAtFirst(data);
            return;
        }
        int count = getCount();
        if (pos > count) {
            System.out.println("Position out of bounds. List size is " + count + ".");
            return;
        }

        Node currNode = heaNode;
        for (int i = 1; i < pos - 1 && currNode != null; i++) {
            currNode = currNode.nexNode;
        }
        tempNode.nexNode = currNode.nexNode;
        currNode.nexNode = tempNode;

        this.traverse();
    }

    public void deleteAtFirst() {
        if (heaNode == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        heaNode = heaNode.nexNode;
        this.traverse();
    }

    public void deleteAtEnd() {
        if (heaNode == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (heaNode.nexNode == null) {
            heaNode = null; // List becomes empty
            this.traverse();
            return;
        }
        Node currNode = heaNode;
        while (currNode.nexNode.nexNode != null) {
            currNode = currNode.nexNode;
        }
        currNode.nexNode = null; // Remove the last node
        this.traverse();
    }

    public void deleteAtPos(int pos) {
        if (pos < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }
        if (heaNode == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (pos == 0) {
            deleteAtFirst();
            return;
        }
        Node currNode = heaNode;

        for (int i = 1; i < pos-1  && currNode != null; i++) {
            currNode = currNode.nexNode;
        }
        if (currNode == null || currNode.nexNode == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        currNode.nexNode = currNode.nexNode.nexNode;
        this.traverse();
    }

    public void searching(int data) {
        Node currNode = heaNode;
        int pos = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                System.out.println("Element " + data + " found at position: " + pos);
                return;
            }
            currNode = currNode.nexNode;
            pos++;
        }
        System.out.println("Element " + data + " not found in the list.");

    }

    public void update(int oldData, int newData) {
        Node currNode = heaNode;
        boolean found = false;
        while (currNode != null) {
            if (currNode.data == oldData) {
                currNode.data = newData;
                found = true;
                break;
            }
            currNode = currNode.nexNode;
        }
        if (found) {
            System.out.println("Updated " + oldData + " to " + newData);
        } else {
            System.out.println("Element " + oldData + " not found.");
        }
        this.traverse();
    }

    public int getCount() {
        int count = 0;
        Node currNode = heaNode;
        while (currNode != null) {
            count++;
            currNode = currNode.nexNode;
        }
        return count;
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

        while (true) {
            System.out.println("Your list is  ");
            list.traverse();
            System.out.println("-----Choose one of the following to perform on the list ------");
            System.out.println("1 -> Insert at First");
            System.out.println("2 -> Insert at End");
            System.out.println("3 -> Insert at Position");
            System.out.println("4 -> Delete at First");
            System.out.println("5 -> Delete at End");
            System.out.println("6 -> Delete at Position");
            System.out.println("7 -> Search for an Element");
            System.out.println("8 -> Update an Element");
            System.out.println("9 -> Get Count of Nodes");
            System.out.println("10 -> Traverse List");
            System.out.println("0 -> Exit");

            Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    int dataFirst = sc.nextInt();
                    list.insertAtFirst(dataFirst);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int dataEnd = sc.nextInt();
                    list.insertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    int dataPos = sc.nextInt();
                    System.out.print("Enter position to insert at: ");
                    int pos = sc.nextInt();
                    list.insertAtPos(dataPos, pos);
                    break;
                case 4:
                    list.deleteAtFirst();
                    break;
                case 5:
                    list.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();
                    list.deleteAtPos(delPos);
                    break;
                case 7:
                    System.out.print("Enter element to search: ");
                    int searchData = sc.nextInt();
                    list.searching(searchData);
                    break;
                case 8:
                    System.out.print("Enter element to update: ");
                    int oldData = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newData = sc.nextInt();
                    list.update(oldData, newData);
                    break;
                case 9:
                    System.out.println("Count of nodes: " + list.getCount());
                    break;
                case 10:
                    list.traverse();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
