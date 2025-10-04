public class No {
    private char letra;
    private final No[] filhos;
    private boolean temFilhos;

    public No(char letra){
        this.letra = letra;
        this.filhos = new No[37];
        this.temFilhos = false;
    }

    public boolean semFilhos(){
        return !this.temFilhos;
    }

    public char getLetra() {
        return letra;
    }

    public void inserirFilho(No no){

    }

    public No[] getFilhos() {
        return filhos;
    }

    public void setLetra(char letra){
        this.letra = letra;
    }
}
