package com.codecool.mytree;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {

    private T value;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(T value) {
        this.value = value;
        this.children = new LinkedList<Node<T>>();
    }

    public void addChild(T value) {
        Node child = new Node<T>(value);
        child.setParent(this);
        this.children.add(child);
    }

    public void removeChild(Node<T> child) {
        children.remove(child);
    }

    public boolean isRoot() {
        return this.getParent() == null;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
