/**
 * Created by AdminCOOP on 26/3/2017.
 */
public class BinarySearchTree {

    private class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {

        if (root == null)
            return true;

        if(root.left!=null) {
            if (maxLeft(root.left) == -1 || root.data <= maxLeft(root.left))
                return false;
            if (!checkBST (root.left))
                return false;
        }

        if(root.right !=null) {
            if (minRight(root.left) == -1 || root.data >= minRight(root.right))
                return false;
            if (!checkBST (root.right))
                return false;
        }
        return true  ;

    }

    int maxLeft(Node node) {
        if (node.right != null) {
            if (node.right.data < node.data)
                return -1;
            else
                return maxLeft(node.right);
        } else
            return node.data;
    }

    int minRight(Node node) {
        if (node.left != null) {
            if (node.left.data > node.data)
                return -1;
            else
                return minRight(node.left);
        } else
            return node.data;
    }

}
