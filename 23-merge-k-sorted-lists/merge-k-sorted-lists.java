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
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                pq.add(current.val);
                current = current.next;
            }
        }
        //for(int x: pq){
            System.out.println(pq);
        // }
        ListNode head = new ListNode(0);
        ListNode ln = head;
        while(!pq.isEmpty()){
            ln.next = new ListNode(pq.poll());
            ln=ln.next;
        }
        return head.next;
    }
}