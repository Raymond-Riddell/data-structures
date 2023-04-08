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
        if (head == null || head.getData() > data) {
            head = new Node(data, head);
            return head;
        }

        else {
            Node helpPtr = head;

            while (helpPtr.getNext() != null) {
                if (helpPtr.getNext().getData() > data) {
                    break;
                }
                helpPtr = helpPtr.getNext();
            }

            Node temp = new Node(data, helpPtr.getNext());
            helpPtr.setNext(temp);
        }
        return head;
    }

    public int search(int value) {
        Node helpPtr = head;
        boolean flag = false;
        int idx = 0;

        while (helpPtr != null) {
            if (helpPtr.getData() == value) {
                flag = true;
                break;
            }
            helpPtr = helpPtr.getNext();
            idx++;
        }

        if (flag) {
            return idx;
        }
        else {
            return -1;
        }
    }

    public Node remove(int value) {
        Node helpPtr = head;

        if (head.getNext() == null && head.getData() == value) {
            return null;
        }

        while (helpPtr.getNext() != null) {
            if (helpPtr.getNext().getData() == value && helpPtr.getNext().getNext() != null) {
                helpPtr.setNext(helpPtr.getNext().getNext());
            }
            else if (helpPtr.getNext().getData() == value && helpPtr.getNext().getNext() == null) {
                helpPtr.setNext(null);
            }
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

    public int sumNodes(LinkedList list) {
        int value = 0;
        Node helpPtr = head;

        while (helpPtr != null) {
            value +=  helpPtr.getData();
            helpPtr = helpPtr.getNext();
        }
        return value;
    }
}
