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
    public ListNode removeElements(ListNode head, int val) {
       /* while (head != null && head.val == val) 
            head = head.next;
        ListNode temp = head;
        if(head==null)
            return null;
        while(head!=null){
            if(head.val==val){
                temp.next=head;
                temp=temp.next;
            }
            head=head.next;
        }
        temp.next=null;
        return temp;
        */
         if (head == null) 
             return null;
    ListNode temp = head;
    while (temp.next != null) {
        if (temp.next.val == val) 
            temp.next = temp.next.next;
        else 
            temp = temp.next;
    }
    return head.val == val ? head.next : head;
    }
}