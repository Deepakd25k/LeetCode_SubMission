/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        helper(root);
        return root;
    }
    
    private void helper(Node node) {
        if(node == null) return;
                
        Node nextNode = getNextNode(node.next); //recursively try to get the node to be connected with either right or left
        
        if(node.left != null) node.left.next = node.right != null ? node.right : nextNode;
        
        if(node.right != null) {
            node.right.next = nextNode;
        }
        
        helper(node.right); //Need to connect the right side first! We will fail to connect flipped V shaped deep trees otherwise
        helper(node.left);
    }
    
    private Node getNextNode(Node node) {
        if(node == null) return node;
        if(node.left != null) return node.left;
        if(node.right != null) return node.right;
        
        return getNextNode(node.next);
    }
}