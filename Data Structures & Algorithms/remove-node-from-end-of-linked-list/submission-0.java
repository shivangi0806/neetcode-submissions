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
        int s=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            s++;
        }
        if(s==n){
          head=head.next;
          return head;
        }
        int i=0;
        int indx= s-n-1;
        ListNode prev=head;
        while(i<indx){
            prev=prev.next;
            i++;
        } prev.next = prev.next.next;
        return head;
    }
}
