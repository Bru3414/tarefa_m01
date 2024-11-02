package br.com.bdam;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Integer> pilha = new ArrayList<>();

    public void push(Integer valor) {
        pilha.add(valor);
    }

    public Integer pop() {

        if (!isEmpty()) {
            Integer lastIndex = pilha.size() - 1;
            Integer lastValor = pilha.get(lastIndex);

            pilha.remove(lastValor);
            return lastValor;
        }

        System.out.println("Pilha vazia");
        return null;
    }

    public Integer top() {
        if (!isEmpty()) {
            Integer lastIndex = pilha.size() - 1;
            return pilha.get(lastIndex);
        }

        System.out.println("Pilha vazia");
        return null;
    }

    public Integer size() {
        return pilha.size();
    }

    public Boolean isEmpty() {
        return !(pilha.size() >= 1);
    }
}
