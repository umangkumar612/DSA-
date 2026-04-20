import java.util.Scanner;

public class stackLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LLstack {
        Node head = null;
        int size = 0;

         void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty:");
                return -1;
            }
            int popval = head.data;
            head = head.next;
            size--;
            return popval;
        }

        int sizeof() {
            return size;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty:");
                return -1;
            }
            return head.data;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LLstack st = new LLstack();
        Scanner sc = new Scanner(System.in);
        int key = 0;
        do {
            System.out.println("Stack operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Check if empty");
            System.out.println("7. Exit");

            System.out.println("Enter key: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Enter the number to push: ");
                    int num = sc.nextInt();
                    st.push(num);
                    break;
                case 2:
                    int poppedValue = st.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;
                case 3:
                    int top = st.peek();
                    if (top != -1) {
                        System.out.println("Top of stack: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Stack contents: ");
                    st.display();
                    break;
                case 5:
                    System.out.println("Size of stack: " + st.sizeof());
                    break;
                case 6:
                    System.out.println("Is stack empty: " + st.isEmpty());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (key != 7);
    }
}
