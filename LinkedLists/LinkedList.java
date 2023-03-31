package LinkedLists;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        head = add(head, data);
    }

    private Node add(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }

        else {
            Node helpPtr = head;

            while (helpPtr.getNext() != null) {
                helpPtr = helpPtr.getNext();
            }

            Node temp = new Node(data, helpPtr.getNext());
            helpPtr.setNext(temp);
        }
        return head;
    }

    public void print() {
        Node helpPtr = head;

        while (helpPtr != null) {
            System.out.println(helpPtr.getData() + " ");
            helpPtr = helpPtr.getNext();
        }
    }
}
