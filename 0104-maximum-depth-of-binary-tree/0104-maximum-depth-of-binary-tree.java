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
    int count=0;
    public int maxDepth(TreeNode root) {
        count=0;
       find(root,count);
       return count;
    }
     void find(TreeNode root,int depth){
        if(root==null){
            return;
        }
        depth++;
        count=Math.max(count,depth);
        find(root.left,depth);
        find(root.right,depth);
    }
}