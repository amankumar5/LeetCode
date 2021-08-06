/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size= q.size();
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < size;i++)
            {
                Node ele = q.poll();
                result.add(ele.val);
                for(Node child : ele.children){
                    q.add(child);
                }
            }
            ans.add(result);
        }
        return ans;
    }
}