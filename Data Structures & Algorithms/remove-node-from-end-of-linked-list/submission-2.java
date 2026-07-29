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
        ListNode temp = head;
        int count = 0, i = 0;

        while(temp != null){
            temp = temp.next;
            count++; 
        }
        temp = head;

        if(count == n){
            head = head.next;
            return head;
        }

        while(temp != null){
            if(i == count - n - 1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            i++;
        }
        return head;
    }
}
