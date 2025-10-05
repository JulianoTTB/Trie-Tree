public class ArvoreTrie {
    private No raiz;

    public ArvoreTrie(){

    }

    public void inserir(String palavra){
        No atual = this.raiz;
        palavra = palavra.toLowerCase();
        int tamanho = palavra.length();
        for(int i = 0; i < tamanho; i++) {
            char letra = palavra.charAt(i);
            No novo_no = new No(letra, i == tamanho -1);
            No existe = atual.buscar(letra);

            if(existe != null){
                atual = existe;
            }
            else{
                atual.inserirFilho(novo_no);
                atual = novo_no;
            }
        }
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
