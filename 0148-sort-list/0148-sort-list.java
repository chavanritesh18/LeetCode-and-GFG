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
    public ListNode sortList(ListNode head) {
        
        ListNode temp =  head;
        
        ArrayList<Integer> arr  = new ArrayList<>();

        // Traverse the linked list and add all the elements of the linked list in the array list
        while(temp  != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }

        // after adding the elements in the linked list sort them by using collections sort method in java
        
        Collections.sort(arr);
        
        int i = 0; // for iterating over the arraylist


        // assing the temp again to head
        temp  = head;

        // traverse again and assign the sorted values to the linked list
        while(temp != null)
        {
            temp.val =  arr.get(i);
            i++;
            temp  = temp.next;
            
        }


        // return the head of the linked list as all elments are stored in sorted order.
        return head;
    }
}
