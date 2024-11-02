import br.com.bdam.FilaFIFO;
import br.com.bdam.Pilha;
import br.com.bdam.listaEncadeada.ListaEncadeada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pilhaTest();
        filaFIFOTest();
        listaEncadeadaTest();
    }

    static void pilhaTest() {
        System.out.println(" ");
        System.out.println("Pilha:");

        Pilha pilha = new Pilha();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        System.out.println("top: " + pilha.top());
        System.out.println("pop: " + pilha.pop());
        System.out.println("top: " + pilha.top());
        System.out.println("isEmpty: " + pilha.isEmpty());
        System.out.println("size: " + pilha.size());
    }

    static void filaFIFOTest() {
        System.out.println(" ");
        System.out.println("Fila FIFO:");

        FilaFIFO filaFIFO = new FilaFIFO();

        filaFIFO.enqueue(1);
        filaFIFO.enqueue(6);
        filaFIFO.enqueue(4);
        filaFIFO.enqueue(8);
        System.out.println("front: " + filaFIFO.front());
        System.out.println("rear: " + filaFIFO.rear());
        filaFIFO.dequeue();
        System.out.println("front: " + filaFIFO.front());
        System.out.println("isEmpty: " + filaFIFO.isEmpty());
        System.out.println("size: " + filaFIFO.size());
    }

    static void listaEncadeadaTest() {
        System.out.println(" ");
        System.out.println("Lista Encadeada:");

        ListaEncadeada lista = new ListaEncadeada();
        lista.push(2);
        lista.push(5);
        lista.push(9);
        lista.insert(1, 8);
        lista.insert(3, 7);

        System.out.println(lista.elementAt(0));
        System.out.println(lista.elementAt(1));
        System.out.println(lista.elementAt(2));

        lista.remove(3);
        System.out.println(lista.pop());
        System.out.println("Tamanho da lista: " + lista.getSize());
        System.out.println(lista.printList());
    }
}