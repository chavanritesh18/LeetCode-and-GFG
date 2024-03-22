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
    public List<Integer> preorderTraversal(TreeNode root) {
        
//      Creating the empty list   
        
        List<Integer> pre  = new ArrayList<>();
//      calling the function   
        
        preHelper(root , pre);
//         return the list;
        return pre;
        
    }
    
    public void preHelper(TreeNode root , List<Integer> pre)
    {
        // if root becomes null we can return 
        if(root ==  null) 
        {
            return;
        }
        
        // adding the root value to the list
        pre.add(root.val);
        
//         Now traverse on the left direction
        preHelper(root.left , pre);
        
//       Now travers on the right and the right elements to the list  
        
        preHelper(root.right, pre);
        
        
    }
}