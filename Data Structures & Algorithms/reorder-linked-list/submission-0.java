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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return ;

        ListNode cur = head, slow = head, fast = head, temp = null;
        int count = 0;
        Stack<ListNode> st = new Stack<>();

        // lets go to the mid
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        //Push second half of list in stack
        while(slow != null){
            st.push(slow);
            slow = slow.next;
        }

        while(count-- > 0){
            ListNode node = st.pop();
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        cur.next = null;
    }
}
