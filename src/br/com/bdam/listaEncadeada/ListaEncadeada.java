package br.com.bdam.listaEncadeada;

public class ListaEncadeada {
    private Node head;
    private Node tail;
    private int size;

    public void push(int value) {
        Node celula = new Node(value);

        if (size == 0) {
            this.head = celula;
        } else {
            this.tail.setNext(celula);
        }
        this.tail = celula;
        this.size++;
    }

    public Node pop() {
        if (this.size == 0) {
            return null;
        }

        if (this.size == 1) {
            Node removido = this.head;
            this.head = null;
            this.tail = null;
            this.size--;
            return removido;
        }

        Node penultimoNode = this.head;

        for (int i = 0; i < size - 2; i++) {
            penultimoNode = penultimoNode.getNext();
        }

        Node removido = penultimoNode.getNext();
        penultimoNode.setNext(null);
        this.tail = penultimoNode;
        this.size--;

        return removido;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (index == 0) {

            if (this.size == 0) {
                Node newNode = new Node(value);
                this.head = newNode;
                this.tail = newNode;
            } else {
                Node newNode = new Node(value, this.head);
                this.head = newNode;
            }
            this.size++;

        } else if (index == this.size) {
            this.push(value);
        } else {
            Node nodeAnterior = this.elementAt(index - 1);
            Node proximoNode = nodeAnterior.getNext();
            Node newNode = new Node(value, proximoNode);
            nodeAnterior.setNext(newNode);
            this.size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (index == 0 && this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        }

        if (index == 0) {
            this.head = elementAt(1);
            this.size--;
        } else {
            Node nodeAnterior = elementAt(index-1);
            Node node = elementAt(index);
            nodeAnterior.setNext(node.getNext());
            node = null;
            this.size--;
        }


    }

    public Node elementAt(int index) {
        if (!(index >= 0 && index <= this.size - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        Node nodeAtual = this.head;
        for (int i = 0; i < index; i++) {
            nodeAtual = nodeAtual.getNext();
        }

        return nodeAtual;
    }

    public String printList() {
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node atual = this.head;
        for (int i = 0; i < size - 1; i++) {
            builder.append(atual.getValue()).append(", ");
            atual = atual.getNext();
        }
        builder.append(atual.getValue()).append("]");

        return builder.toString();
    }

    public int getSize() {
        return this.size;
    }
}
