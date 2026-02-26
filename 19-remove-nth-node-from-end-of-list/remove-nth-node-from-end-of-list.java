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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        int cntr=1;
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(cntr<=n){
            ptr1=ptr1.next;
            cntr++;
        }
        if(ptr1==null) return head=head.next;
        while(ptr1.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        
        ptr2.next=ptr2.next.next;
        
        return head;
    }
}