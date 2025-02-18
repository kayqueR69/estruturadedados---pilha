import pilha.Pilha;
import pilha.PilhaDinamica;

public class Main {
    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        for (int c = 0; c < 10; c++) {
            pilha.push(c+1);
        }

        System.out.println(pilha.pop());
        System.out.println(pilha.top());
    }
}