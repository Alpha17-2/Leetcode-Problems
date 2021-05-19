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
        
       List<ListNode> mylist=new ArrayList<ListNode>();
       ListNode ans=head;
       int N=0;
       while(head!=null)
       {
           mylist.add(head);
           head=head.next;
           N++;
       }
       int index=N-n;
       if(index==0) return ans.next; // Case 1: delete first node
       if(index==N-1) // Case 2: delete last node
       {
           ListNode prev=mylist.get(index-1);
           prev.next=null;
           return ans;
       }
       // Node to be deleted is in the middle
       ListNode prev=mylist.get(index-1);
       ListNode current=mylist.get(index+1);
       prev.next=current;
       return ans;  
    }
}