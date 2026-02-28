class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);
        ListNode smallPtr = smallDummy;
        ListNode bigPtr = bigDummy;

        while (head != null) {
            if (head.val < x) {
                smallPtr.next = head;
                smallPtr = smallPtr.next;
            } else {
                bigPtr.next = head;
                bigPtr = bigPtr.next;
            }
            head = head.next;
        }

      
        bigPtr.next = null;


        smallPtr.next = bigDummy.next;

        return smallDummy.next;
    }
}