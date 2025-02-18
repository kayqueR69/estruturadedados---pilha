package pilha;

public class PilhaDinamica {

    private No topo;
    private int tamanho;

    public PilhaDinamica () {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push (int elemento) {
        No novoNo = new No(elemento, this.topo);

        this.topo = novoNo;
        this.tamanho++;
    }

    public boolean isEmpty () {
        return this.topo == null;
    }

    public int size () {
        return this.tamanho;
    }

    public int top () {
        return this.topo.getElemento();
    }

    public int pop () {

        if (!isEmpty()) {
            No elementoTopo = this.topo;
            this.topo = this.topo.getProximo();
            this.tamanho--;
            return elementoTopo.getElemento();
        }

        return -1;
    }
}
