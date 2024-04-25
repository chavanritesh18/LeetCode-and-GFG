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

    private int ans  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    private int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight  = height(root.left);
        int  rightHeight = height(root.right);


        int currDia = (leftHeight + rightHeight);

        ans  = Math.max(ans , currDia);
 

        return Math.max(leftHeight , rightHeight) + 1;
    }
}