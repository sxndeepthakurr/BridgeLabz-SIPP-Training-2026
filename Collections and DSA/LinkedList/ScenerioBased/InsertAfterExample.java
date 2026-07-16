public class InsertAfterExample {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void insertAfter(Node current, int trackId) {
        if (current == null)
            return;

        Node newNode = new Node(trackId);

        // Save the remaining list
        newNode.next = current.next;

        // Insert new node
        current.next = newNode;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        System.out.println("Before insertion:");
        display(head);

        insertAfter(head.next, 30);

        System.out.println("After insertion:");
        display(head);
    }
}