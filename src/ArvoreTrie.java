public class ArvoreTrie {
    private No raiz;

    public ArvoreTrie(){

    }

    public void busca(String palavra) {
        No atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char letraAtual = palavra.charAt(i);
            No filho = atual.buscar(letraAtual);
            if (filho != null) {
                atual = filho;
            } else {
                System.out.println("A palavra não existe!");
                return;
            }
        }
        if (atual.eUltimaLetra()) {
            System.out.println("A palavra está na árvore!");
        } else {
            System.out.println("A palavra não está na árvore!");
        }
    }
}
