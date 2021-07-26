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
    
    public TreeNode createBinaryTree(int[] nums,int strt,int end)
    {
        if(strt > end)
            return null;
        int mid = (strt+end)/2;
        TreeNode nodeTemp = new TreeNode(nums[mid]);
        nodeTemp.left = createBinaryTree(nums,strt,mid-1);
        nodeTemp.right = createBinaryTree(nums,mid+1,end);
        return nodeTemp;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBinaryTree(nums,0,nums.length-1);
    }
}