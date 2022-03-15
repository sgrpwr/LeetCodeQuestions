
public class Sol {
    public static void main(String[] args) {
        deleteNode(ListNode node)
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
