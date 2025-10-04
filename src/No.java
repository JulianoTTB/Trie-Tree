public class No {
    private char letra;
    private final No[] filhos;

    public No(char letra){
        this.letra = letra;
        this.filhos = new No[37];
    }

    public char getLetra() {
        return letra;
    }

    public No[] getFilhos() {
        return filhos;
    }

    public void setLetra(char letra){
        this.letra = letra;
    }
}
