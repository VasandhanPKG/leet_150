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
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode prev_blk=null;
    ListNode next_blk;
    ListNode prev=head;
    ListNode nxt=head;
    while(true)
    {
    int ind=1;
    while(ind<k && nxt!=null)
    {
        nxt=nxt.next;
        ind++;
    }
    if(nxt==null)
    {
        return head;
    }
    next_blk=nxt.next;
    if(prev_blk!=null)
    {
    prev_blk.next=Reverse_k_node(prev,k);
    }
    
    else
    {
        head=Reverse_k_node(prev,k);
    }
    prev.next=next_blk;
    prev_blk=prev;
    prev=next_blk;    
    nxt=prev;
  

    }
 
        
    }
    public ListNode Reverse_k_node(ListNode ptr,int k)
    {
        ListNode prev=null;
        ListNode curr=ptr;
        ListNode next=null;
        int ind=0;
        while(ind++<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}