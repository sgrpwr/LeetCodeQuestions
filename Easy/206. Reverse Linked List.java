class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode curr = null;
        ListNode currNext = head;
        ListNode prev = null;

        while(currNext!=null){
            prev = curr;
            curr = currNext;
            currNext = curr.next;
            curr.next = prev;
        }

        return curr;
    }
}
