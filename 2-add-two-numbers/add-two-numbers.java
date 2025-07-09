class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode head = new ListNode();
        ListNode current = head;
        boolean carry = false;

        while (current1 != null || current2 != null || carry) {
            int val1 = (current1 != null) ? current1.val : 0;
            int val2 = (current2 != null) ? current2.val : 0;
            int sum = val1 + val2;
            if (carry) {
                sum++;
                carry = false;
            }
            if (sum > 9) {
                carry = true;
                sum = sum % 10;
            }
            current.next = new ListNode(sum);
            current = current.next;
             if (current1 != null) {
                current1 = current1.next;
            }
            if (current2 != null) {
                current2 = current2.next;
            }
        }
        return head.next;
    }
}