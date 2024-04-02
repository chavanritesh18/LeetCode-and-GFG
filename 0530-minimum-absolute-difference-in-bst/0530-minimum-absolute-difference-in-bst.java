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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();

        int ans  = Integer.MAX_VALUE;

        inOrder(root , al);

        for(int i = 0; i <  al.size() - 1; i++)
        {
            ans  = Math.min(ans , Math.abs(al.get(i) - al.get(i + 1)));
        }

        return ans;
      
        

    }

    void inOrder(TreeNode root , ArrayList<Integer> al)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left , al);
        al.add(root.val);
        inOrder(root.right , al);
    }
}