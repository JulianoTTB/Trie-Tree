public class No {
    private char letra;
    private final No[] filhos;
    private int tamanho;
    private boolean ultimoLetra;

    public No(char letra, boolean ultimoLetra){
        this.letra = letra;
        this.filhos = new No[37];
        this.tamanho = 0;
        this.ultimoLetra = ultimoLetra;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public boolean semFilhos(){
        return this.tamanho == 0;
    }

    public boolean eUltimoLetra(){
        return this.ultimoLetra;
    }

    public char getLetra() {
        return this.letra;
    }

    public void inserirFilho(No no){
       if(this.getTamanho() == 37 || this.buscar(no.getLetra()) != null) return;

       for(int i = 0; i < this.tamanho + 1; i++){
           if (this.filhos[i] == null) {
               this.filhos[i] = no;
               break;
           }
       }
       this.tamanho++;
    }

    public void remover(char letra){
        if(buscar(letra) == null || semFilhos()) return;

        for(int i = 0; i < this.tamanho; i++){
            No atual = this.filhos[i];
            if (atual == null) continue;
            if (atual.getLetra() == letra) {
                this.filhos[i] = this.filhos[this.tamanho - 1];
                this.filhos[tamanho - 1] = null;
                break;
            }
        }
        this.tamanho--;
    }

    public No buscar(char letra){
        for(int i = 0; i < this.tamanho; i++){
            No atual = this.filhos[i];
            if (atual == null) continue;
            if (atual.getLetra() == letra) return atual;
        }
        return null;
    }

    public No[] getFilhos() {
        return filhos;
    }

    public void setLetra(char letra){
        this.letra = letra;
    }

    public void setUltimoLetra(boolean ultimoLetra){
        this.ultimoLetra = ultimoLetra;
    }
}
