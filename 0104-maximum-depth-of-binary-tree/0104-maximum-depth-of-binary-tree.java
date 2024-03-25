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
    public int maxDepth(TreeNode root) {
        
        if(root  == null)
        {
            return 0;
        }

       //  Traverse the left side and the store the total depth
        int left  =  maxDepth(root.left);

        // Traverse the right side and store that depth
        int right  =  maxDepth(root.right);

       //  Find out the maximum between the left and right and add the +1 for the root 
        int ans  =  Math.max(left , right ) + 1;

        return ans;
    }
}