/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> a.val-b.val);
        for(ListNode list: lists){
            while(list!=null){
                pq.add(list);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(pq.peek() != null){
            pq.peek().next = null;
            current.next = pq.poll();
            current = current.next;
        }
        return dummy.next;
    }
}