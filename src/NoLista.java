public class NoLista {
    private char letra;
    private NoLista prox;
    private boolean ultimaLetra;

    public NoLista(char letra, boolean ultimaLetra){
        this.letra = letra;
        this.prox = null;
        this.ultimaLetra = ultimaLetra;
    }

    public boolean eUltimaLetra(){
        return this.ultimaLetra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public NoLista getProx() {
        return prox;
    }

    public void setProx(NoLista prox) {
        this.prox = prox;
    }
}
