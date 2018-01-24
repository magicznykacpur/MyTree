package com.codecool.mytree;

public class MyTree {

    private BNode root;

    public MyTree() {
    }

    public void add(int value) {
        BNode current = root;
        BNode newNode = new BNode(value);

        if (!isRootSet())
            setRoot(newNode);

        while (true) {

            if (value < root.getValue()) {
                if (current.getLeftChild() == null) {
                    current.setLeftChild(newNode);
                    break;
                } else
                    current = current.getLeftChild();
            } else {
                if (current.getRightChild() == null) {
                    current.setRightChild(newNode);
                    break;
                } else
                    current = current.getRightChild();
            }
        }
    }

    public boolean contains(int value) {
//        BNode current = root;
//
//        while (true) {
//            if (value == current.getValue())
//                return true;
//            else {
//                if (value < current.getValue()) {
//                    current = current.getLeftChild();
//                    if
//                }
//
//            }
//        }
    }

    public boolean isRootSet() {
        return root == null;
    }

    public BNode getRoot() {
        return this.root;
    }

    public void setRoot(BNode root) {
        this.root = root;
    }
}
