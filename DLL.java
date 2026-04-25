public class DoublyLinkedList {
    Node head;
    Node tail;

    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Add node at the beginning of the list
    public static Node addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
    }

    // Add node at the end of the list
    public Node addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } 
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
    }

    // Remove node from the beginning of the list
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
        }
    }

    // Remove node from the end of the list
    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
        }
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print the list in reverse order
    public void printReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(40);
        dll.addLast(50);

        System.out.println("List: ");
        dll.printList();

        System.out.println("List in reverse order: ");
        dll.printReverse();

        dll.removeFirst();
        dll.removeLast();

        System.out.println("List after removing first and last node: ");
        dll.printList();
    }
}