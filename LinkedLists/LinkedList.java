package LinkedLists;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node add(int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }

        else {
            Node helpPtr = head;

            while (helpPtr.getNext() != null) {
                helpPtr = helpPtr.getNext();
            }

            Node temp = new Node(data);
            helpPtr.setNext(temp);
        }
        return head;
    }

    public void print() {
        Node helpPtr = head;

        while (helpPtr != null) {
            System.out.print(helpPtr.getData() + " ");
            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }
}
