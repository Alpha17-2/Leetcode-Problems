/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    List<Integer> ans = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        inorder(root.left);
        inorder(root.right);
    }
    
    public List<Integer> getAllElements(TreeNode a, TreeNode b) {
        
        inorder(a);
        inorder(b);
        Collections.sort(ans);
        return ans;
    }
}