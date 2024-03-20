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
    public int countNodes(TreeNode root) {
        
        if(root  ==  null)
        {
            return 0;
        }
        
//         Travel in left direction and stoers its count
        int x  = countNodes(root.left);
        
//     Travel in right direction and stores its count
        
        
        int y  = countNodes(root.right);
        
//         sum of left nodes and the sum of the right nodes and +1 for the root node
        return x+y+1; 
        
        
        // +1  is taken here beacuse we have to count the root node also
    }
}