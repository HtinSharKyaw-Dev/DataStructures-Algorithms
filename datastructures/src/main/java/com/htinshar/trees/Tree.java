package com.htinshar.trees;

public class Tree {
    private TreeNode root;

    public void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insertData(data);
        }
    }

    public void transverseData() {
        if(root == null) {
            System.out.println("Tree is empty");
            return;
        }
        root.transverseTree();
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public TreeNode getMin() {
        if (root != null) {
            return root.getMin();
        }
        return new TreeNode(Integer.MIN_VALUE);
    }

    public TreeNode getMax() {
        if (root != null) {
            return root.getMax();
        }
        return new TreeNode(Integer.MAX_VALUE);
    }
}
