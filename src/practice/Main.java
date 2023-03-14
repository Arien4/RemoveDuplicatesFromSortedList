package practice;

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the
// linked list sorted as well.

public class Main {

    public static void main(String[] args) {
	    ListNode n1 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, null)))));
        ListNode n2 = new Solution().deleteDuplicates(n1);
        ListNode current = n2;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
