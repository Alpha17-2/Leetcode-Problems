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
    ListNode ans=new ListNode(0,null);
    public ListNode create(int val)
    {
        ListNode newNode=new ListNode(val,null);
        return newNode;
    }
    ListNode sortedMerge(ListNode a, ListNode b) 
    { 
        ListNode result = null; 
        /* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        /* Pick either a or b, and recur */
        if (a.val <= b.val) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 
  
    ListNode mergeSort(ListNode h) 
    { 
        // Base case : if head is null 
        if (h == null || h.next == null) { 
            return h; 
        } 
  
        // get the middle of the list 
        ListNode middle = getMiddle(h); 
        ListNode nextofmiddle = middle.next; 
  
        // set the next of middle node to null 
        middle.next = null; 
  
        // Apply mergeSort on left list 
        ListNode left = mergeSort(h); 
  
        // Apply mergeSort on right list 
        ListNode right = mergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        ListNode sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    public static ListNode getMiddle(ListNode head) 
    { 
        if (head == null) 
            return head; 
  
        ListNode slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 
  
   
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
         ListNode temp=ans;
         
        for(int i=0;i<n;i++)
        {
            ListNode current = lists[i];
            while(current!=null)
            {
                temp.next=create(current.val);
                temp=temp.next;
                current=current.next;
            }
            
        }
        
        ans.next=mergeSort(ans.next);
        
        return ans.next;
    }
}