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
    
    public ListNode create(int value)
    {
        ListNode temp=new ListNode(value,null);
        return temp;
    }
    public ListNode deleteDuplicates(ListNode head) {
     
        TreeMap<Integer,Integer> mymap=new TreeMap<Integer, Integer>();
        ListNode ans=new ListNode(0,null);
        ListNode current=ans;
        while(head!=null)
        {
            int val=head.val;
             if (mymap.containsKey(val))
            {
                int frequency=mymap.get(val);
                ++frequency;
                mymap.put(val,frequency);
            }
            else
                mymap.put(val,1);
            head=head.next;
        }
        for (Map.Entry mapElement : mymap.entrySet())
        {
            int value=(int)(mapElement.getKey());
            int frequency=(int)(mapElement.getValue());
            if(frequency==1)
            {
                current.next=create(value);
                current=current.next;
            }
        }
        return ans.next;
        
        
    }
}