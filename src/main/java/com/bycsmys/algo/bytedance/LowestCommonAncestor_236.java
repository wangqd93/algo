package com.bycsmys.algo.bytedance;

import com.bycsmys.algo.common.TreeNode;

public class LowestCommonAncestor_236 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }

        if (p == root || q == root) {
            return root;
        }

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode != null && rightNode != null) {
            return root;
        } else if (leftNode != null) {
            return leftNode;
        } else if (rightNode != null) {
            return rightNode;
        }

        return null;
    }


}
