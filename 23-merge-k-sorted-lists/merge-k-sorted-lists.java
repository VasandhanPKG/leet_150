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
        ListNode res=null;
        for(ListNode node:lists)
        {
            res=merge2list(res,node);
        }
        return res;
        
    }
    ListNode merge2list(ListNode head1,ListNode head2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.val<=head2.val)
            {
               cur.next=head1;
               head1=head1.next;
            }
            else
            {
                cur.next=head2;
                head2=head2.next;
            }
            cur=cur.next;
        }
        if(head1!=null)
        {
            cur.next=head1;
        }
        else cur.next=head2;
         return dummy.next;
    }
}