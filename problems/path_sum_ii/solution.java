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
    public void findPath(TreeNode root,int sum, List<Integer> current,List<List<Integer>>ans )
    {
        if(root ==null)
            return;
        current.add(root.val);
        if(sum == root.val && root.left == null && root.right == null)
        {    
            ans.add(current);
            return;
        }
        findPath(root.left, sum-root.val,new ArrayList<Integer>(current),ans);
        findPath(root.right, sum-root.val,new ArrayList<Integer>(current),ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        findPath(root, targetSum, new ArrayList<Integer>(), ans);
        return ans;
    }
}