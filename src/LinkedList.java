public class LinkedList {
    private Node head;
    int length = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        int data = current.next.data;
        current.next = null;
        length--;
        return data;
    }

    public int shift() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        length--;
        return data;
    }

    public void unshift(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println(current.data);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void traverse() {
        Node current = head;
        System.out.println("Traversal of linked list:");
        while (current != null) {
            System.out.print("[ " + current.data + " ] ->");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int data, int position) {
        if (length <= position || position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);

        if (position == 0) {
            unshift(data);
            return;
        }

        if (position == length - 1) {
            push(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }

    public int remove(int position) {
        if (position < 0 || position >= length) {
            System.out.println("Invalid position");
            return -1;
        }

        if (position == 0) {
            return shift();
        }

        if (position == length - 1) {
            return pop();
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        int del = current.next.data;
        current.next = current.next.next;
        length--;
        return del;
    }
}
