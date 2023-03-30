package com.bycsmys.algo.bytedance;

import com.bycsmys.algo.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        zigzagLevelOrder(root, res, 0);

        return res;

    }

    private void zigzagLevelOrder(TreeNode root, List<List<Integer>> res, int level) {
        if(root == null){
            return;
        }

        if (res.size() == level) {
            res.add(new ArrayList<>());
        }

        if (level % 2 == 1) {
            res.get(level).add(0, root.val);
        }else {
            res.get(level).add(root.val);
        }

        zigzagLevelOrder(root.left, res, level + 1);
        zigzagLevelOrder(root.right, res, level + 1);

    }

}
