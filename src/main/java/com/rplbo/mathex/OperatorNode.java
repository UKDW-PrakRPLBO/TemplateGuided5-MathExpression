package com.rplbo.mathex;

public abstract class OperatorNode extends Node {
    private Node kiri;
    private Node kanan;

    public OperatorNode(Node kiri, Node kanan) {

    }

    public Node getKiri() {

    }

    public Node getKanan() {

    }

    @Override
    public abstract double hitung();
}
