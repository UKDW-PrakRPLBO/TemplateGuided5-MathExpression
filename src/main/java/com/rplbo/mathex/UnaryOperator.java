package com.rplbo.mathex;

public abstract class UnaryOperator extends Node {
    private Node dataNode;

    public Node getDataNode() {
        
    }

    public UnaryOperator(Node dataNode) {

    }

    @Override
    public abstract double hitung();
}
