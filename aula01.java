public class aula01 {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        personagem p1 = new personagem();
        //p1.nome = "Darkus"; atributo privado
        p1.setNome("Darkus");
        //p1.pontosDeVida = 100; atributo privado
        p1.forca = 20;
        p1.defesa = 15;
        p1.apresentar();

        personagem p2 = new personagem();
        p2.nome = "Ligth";
        p2.pontosDeVida = 100;
        p2.forca = 20;
        p2.defesa = 15;
        p2.apresentar();
    }
}