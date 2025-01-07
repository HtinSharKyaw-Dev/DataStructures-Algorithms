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

    public TreeNode get(int value) {
        if (value == this.data) {
            return this;
        }

        if (value < this.data ) {
            if (left != null) {
                return left.get(value);
            }
        }else {
            if (right != null) {
                return right.get(value);
            }
        }
        return null;
    }

    public TreeNode getMin() {
        if (left != null) {
            return left.getMin();
        }
        return this;
    }

    public TreeNode getMax() {
        if (right != null) {
            return right.getMax();
        }
        return this;
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
