import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DSLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode head = n1;

        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }
}
