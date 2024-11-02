package br.com.bdam;

import java.util.ArrayList;
import java.util.List;

public class FilaFIFO {
    private List<Integer> filaFIFO = new ArrayList<>();

    public void enqueue(Integer valor) {
        filaFIFO.add(valor);
    }

    public void dequeue() {
        if (!isEmpty()) {
            Integer firstValor = filaFIFO.get(0);
            filaFIFO.remove(firstValor);
        }
    }

    public Integer rear() {
        if (!isEmpty()) {
            Integer lastIndex = filaFIFO.size() - 1;

            return filaFIFO.get(lastIndex);
        }

        System.out.println("FilaFIFO vazia");
        return null;
    }

    public Integer front() {
        if (!isEmpty()) return filaFIFO.get(0);

        System.out.println("FilaFIFO vazia");
        return null;
    }

    public Integer size() {
        return filaFIFO.size();
    }

    public Boolean isEmpty() {
        return !(filaFIFO.size() >= 1);
    }
}
