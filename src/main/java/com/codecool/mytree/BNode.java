package com.codecool.mytree;

public class BNode {

    private Integer value;
    private BNode leftChild;
    private BNode rightChild;

    public BNode(Integer value) {
        this.value = value;
    }

    public BNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BNode leftChild) {
        this.leftChild = leftChild;
    }

    public BNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
