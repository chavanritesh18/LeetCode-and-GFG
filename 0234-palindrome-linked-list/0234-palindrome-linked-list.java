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
    public boolean isPalindrome(ListNode head) {
       
       ListNode fast  = head;
       ListNode slow  = head;

       while(fast != null && fast.next != null) // for even case
       {
           fast  = fast.next.next;
           slow  = slow.next;
       }

       if(fast != null) //  for odd case 
       {
           slow  = slow.next;

       }

       slow  = reverseList(slow);
       fast  = head;


       while(slow != null)
       {
             if(fast.val != slow.val)
             {
                 return false;
             }

             fast = fast.next;
             slow =  slow.next;
       }


       return true;
        
    }

    private ListNode reverseList(ListNode head)
    {
        ListNode prev  = null;
        while(head !=  null)
        {
            ListNode next  = head.next;
            head.next  = prev;
            prev  = head ;
            head  = next;
        }


        return prev;
    }

}


 

    