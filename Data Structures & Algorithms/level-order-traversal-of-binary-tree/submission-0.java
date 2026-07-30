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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>(){};

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> levelq = new LinkedList<>();

        levelq.offer(root);

        while(!levelq.isEmpty()){
            List<Integer> levelres = new ArrayList<>();
            int size = levelq.size();
            for(int i = 0; i < size; i++){
                TreeNode node = levelq.poll();
                levelres.add(node.val);

                if(node.left != null)
                    levelq.offer(node.left);

                if(node.right != null)
                    levelq.offer(node.right);
            }
            result.add(levelres);
        }

        return result;

    }
}
