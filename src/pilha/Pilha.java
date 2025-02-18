package pilha;

public class Pilha {

    private int[] elementos;
    private int tamanho;

    public Pilha (int capacidade) {
        this.elementos =  new int[capacidade];
        this.tamanho = 0;
    }

    public int tamanho () {
        return this.tamanho;
    }

    private boolean verifificaCapacidade () {
        return this.tamanho == this.elementos.length;
    }

    private void aumentaCapacidade () {
        int[] novosElementos = new int[this.tamanho * 2];

        for (int c = 0; c < this.tamanho; c++) {
            novosElementos[c] = this.elementos[c];
        }
        this.elementos = novosElementos;
    }

    public void empliha (int elemento) {

        if (verifificaCapacidade()) {
            aumentaCapacidade ();
        }

        elementos[tamanho] = elemento;
        tamanho++;

    }

    public boolean estaVazia () {
        return this.tamanho == 0;
    }

    public int topo () {
        if (estaVazia()) {
            return 0;
        }

        return this.elementos[this.tamanho - 1];
    }

    public int desempilha () {
        int elemento = topo();

        if (!estaVazia()) {
            this.elementos[this.tamanho - 1] = 0;
            this.tamanho--;
        } else {
            throw new RuntimeException("A pilha está vazia");
        }

        return elemento;
    }

}
