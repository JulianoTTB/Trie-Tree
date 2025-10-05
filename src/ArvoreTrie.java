public class ArvoreTrie {
    private No raiz;

    public ArvoreTrie(){
        raiz = new No('\0', false);
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
        if (atual.eUltimoLetra()) {
            System.out.println("A palavra está na árvore!");
        } else {
            System.out.println("A palavra não está na árvore!");
        }
    }

    public boolean removePalavra(No atual, String palavra, int posLetra){
        if (posLetra == palavra.length()){
            if(!atual.eUltimoLetra()){
                return false;
            }
            atual.setUltimoLetra(false);
            return atual.semFilhos();
        }

        char letra = palavra.charAt(posLetra);
        No filho = atual.buscar(letra);

        if(filho == null){
            return false;
        }

        boolean apagarFilho = removePalavra(filho, palavra, posLetra + 1);

        if(apagarFilho){
            atual.remover(letra);
            return !atual.eUltimoLetra() && atual.semFilhos();
        }

        return false;
    }

}
