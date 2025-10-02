public class Principal {
public static void main(String[] args) {
     Tv tv1 = new Tv(101, lista);
    tv1.ligar();
    lista.listarCanais();
    tv1.escolherCanal(7);
    tv1.exibirInfo();

    lista.adicionarCanal(new Canal(5, "Globo"));
    lista.adicionarCanal(new Canal(7, "Record"));
    lista.adicionarCanal(new Canal(9, "SBT"));
}
}
