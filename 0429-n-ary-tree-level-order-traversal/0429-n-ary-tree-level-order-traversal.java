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
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node node = q.poll();
                if (node.children != null) {
                    for (Node c: node.children) {
                        q.offer(c);
                    }
                }
                level.add(node.val);
            }
            res.add(level);
        }

        return res;
    }
}
