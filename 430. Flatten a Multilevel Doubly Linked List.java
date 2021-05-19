/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    
    List<Integer> mylist = new ArrayList<>();
    public void solve(Node head){
    
        if(head == null)
            return;
        mylist.add(head.val);
        
        solve(head.child);
        solve(head.next);
    }
    public Node create(int val,Node prev){
        // create new node
        Node t = new Node();
        t.val=val;
        t.prev = prev;
        t.next = null;
        return t;
    }
    public Node flatten(Node head) {
        
        if(head==null) return null;
        solve(head);
        Node ans = new Node();
        Node p = ans;
        if(mylist.size()==0)
            return null;
        else
        {
           p.val = mylist.get(0);
           p.prev=null;
        }
        for(int i=1;i<mylist.size();++i)
        {
            p.next = create(mylist.get(i),p);
            p=p.next;
        }
        return ans;
    }
}