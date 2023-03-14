package practice;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            while (current.next != null && current.next.val == current.val) current.next = current.next.next;
            current = current.next;
        }
        return head;
    }
}
