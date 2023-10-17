import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class Linklist {
    static Scanner scanner = new Scanner(System.in);

    static Node getNode() {
        Node p = new Node();
        p.next = null;
        return p;
    }

    static void insertF(Node[] q) {
        Node p = getNode();
        if (p != null) {
            System.out.print("\nEnter node info value: ");
            p.info = scanner.nextInt();
            p.next = q[0];
            q[0] = p;
        }
    }

    static void deleteF(Node[] q) {
        Node p;
        if (q[0] == null)
            System.out.println("\nLink list is empty !!");
        else {
            p = q[0];
            q[0] = p.next;
            p = null;
        }
    }

    static void display(Node[] q) {
        Node p;
        if (q[0] == null)
            System.out.println("\nLink list is empty !!");
        else {
            p = q[0];
            while (p != null) {
                System.out.print(p.info + " ");
                p = p.next;
            }
        }
    }

    static void insertA(Node[] q) {
        Node[] p = new Node[1];
        p[0] = q[0];
        int i, loc;
        System.out.print("Enter node number: ");
        loc = scanner.nextInt();
        for (i = 1; i < loc; i++) {
            if (p[0] == null) {
                System.out.println("\nYou have fewer number of nodes");
                return;
            }
            p[0] = p[0].next;
        }
        Node newNode = getNode();
        if (newNode != null) {
            System.out.print("\nEnter node info value: ");
            newNode.info = scanner.nextInt();
            newNode.next = p[0].next;
            p[0].next = newNode;
        }
    }

    public static void main(String[] args) {
        Node[] list = new Node[1];
        list[0] = null;
        int choice;
        while (true) {
            System.out.println("\n1. BEFORE INSERT");
            System.out.println("2. AFTER INSERT");
            System.out.println("3. DELETE");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insertF(list);
                    break;
                case 2:
                    insertA(list);
                    break;
                case 3:
                    deleteF(list);
                    break;
                case 4:
                    display(list);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nYou have entered wrong choice!!");
            }
        }
    }
}