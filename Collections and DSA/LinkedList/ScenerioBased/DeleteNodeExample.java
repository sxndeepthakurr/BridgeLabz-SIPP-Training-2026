public class DeleteNodeExample {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.val == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
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
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before deletion:");
        display(head);

        head = removeTask(head, 30);

        System.out.println("After deletion:");
        display(head);
    }
}