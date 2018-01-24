package com.codecool.mytree;

import java.util.List;

public class Node<T> {

    private T value;
    private List<Node<T>> children;

    public Node(T value) {
        this.value = value;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }
}
