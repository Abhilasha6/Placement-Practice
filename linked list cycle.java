/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;

        //TLE error, otherwise correct
        // int len = 0;
        // if(head.next==null)
        // return false;

        // while (temp != null) {
        //     len++;
        //     temp = temp.next;
        // }
        // temp=head;
        // int i;
        // for(i=0;i<len;i++)
        // {
        //     ListNode newnode=temp;
        //     while(newnode!=null){
        //         if(newnode.next==temp)
        //         {
        //             return true;
        //         }
        //         newnode=newnode.next;
        //     }            
        //     temp=temp.next;
        // }


        //TLE satisfied
         while (temp != null) //this means te node is visited already & again being visited 2nd time
        {
            if (temp.val == 1000000)
             return true;
            temp.val = 1000000;
            temp = temp.next;
        }
        return false;
    }
}