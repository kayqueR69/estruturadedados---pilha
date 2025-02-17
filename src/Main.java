import pilha.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);

        pilha.empliha(1);
        pilha.empliha(2);
        pilha.empliha(3);
        pilha.empliha(4);
        pilha.empliha(5);
        pilha.empliha(6);
        pilha.empliha(7);
        pilha.empliha(8);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        System.out.println(pilha.desempilha());
        System.out.println(pilha.tamanho());
        System.out.println(pilha);
    }
}