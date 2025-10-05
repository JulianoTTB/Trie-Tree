public class Main {
    public static void main(String[] args){
        ArvoreTrie t1 = new ArvoreTrie();

        t1.inserir("vasco");
        t1.inserir("vascolandia");
        t1.inserir("cachorro");
        t1.inserir("cachoeira");

        t1.busca("vasco");
        t1.busca("vascolandia");
        t1.busca("cachorro");
        t1.busca("cachoeira");

        System.out.println();
        t1.removerPalavra("vasco");
        System.out.println("busca do vasco e vascolandia: ");
        t1.busca("vasco");
        t1.busca("vascolandia");

    }
}