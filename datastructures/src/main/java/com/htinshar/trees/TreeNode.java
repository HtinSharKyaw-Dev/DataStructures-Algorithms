package com.htinshar.trees;

public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insertData(int insertedData) {
        if (insertedData == data) {
            return;
        }
        if (insertedData < this.data) {
            if (left == null) {
                left = new TreeNode(insertedData);
            } else {
                left.insertData(insertedData);
            }
        }
        if (insertedData > this.data) {
            if (right == null) {
                right = new TreeNode(insertedData);
            } else {
                right.insertData(insertedData);
            }
        }
    }

    public void transverseTree() {
        if (left != null) {
            left.transverseTree();
        }

        System.out.print(this.data + ", ");

        if (right != null) {
            right.transverseTree();
        }
    }

}
