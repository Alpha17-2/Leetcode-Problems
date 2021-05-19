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
    public ListNode createNode(int val)
    {
        ListNode t = new ListNode();
        t.val = val;
        t.next = null;
        return t;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode ans = new ListNode();
       ListNode temp = ans;
        int carry = 0;
        while(l1!=null && l2!=null)
        {
            int sum = l1.val + l2.val + carry ;
            temp.next = createNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            int sum = l1.val + carry;
            temp.next = createNode(sum%10);
            carry = sum/10;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            int sum = l2.val + carry;
            temp.next = createNode(sum%10);
            carry = sum/10;
            temp=temp.next;
            l2=l2.next;
        }
        if(carry>0)
            temp.next = createNode(carry);
        
        return ans.next;
        
    }
}