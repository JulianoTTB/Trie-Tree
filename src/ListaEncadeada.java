public class ListaEncadeada {
    private NoLista raiz;
    private int tam;

    public ListaEncadeada(){
        this.raiz = null;
        this.tam = 0;
    }

    public int getTamanho(){
        return this.tam;
    }

    public boolean vazia(){
        return this.tam == 0;
    }

    public void inserir(char letra, boolean ultimaLetra){
        if(buscar(letra) != null) return;

        NoLista novo_no = new NoLista(letra, ultimaLetra);
        if (vazia()){
            this.raiz = novo_no;
            this.tam++;
            return;
        }

        NoLista atual = this.raiz;

        for(; atual.getProx() != null; atual = atual.getProx());

        atual.setProx(novo_no);
        this.tam++;
    }

    public NoLista buscar(char letra){
        if(vazia()) return null;
        for(NoLista atual = this.raiz; atual.getProx() != null; atual = atual.getProx())
            if(letra == atual.getLetra()) return atual;

        return null;
    }

    public void remover(char letra){
        if (vazia() || buscar(letra) == null) return;

        NoLista atual = this.raiz;

        if (atual.getLetra() == letra){
            atual = atual.getProx();
            return;
        }

        NoLista proximo = atual.getProx();

        for(; proximo.getLetra() != letra; proximo = proximo.getProx())
            atual = atual.getProx();

        atual.setProx(proximo.getProx());
        proximo.setProx(null);
        this.tam--;
    }
}
