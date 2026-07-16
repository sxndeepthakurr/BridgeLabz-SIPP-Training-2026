public class DetectCycleExample {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle
        fourth.next = second;

        if (hasRedirectLoop(head))
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle");
    }
}