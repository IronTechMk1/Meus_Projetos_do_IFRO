public class personagem {
    //Atributos
    private String nome;
    private int pontosDeVida;
    private int forca;
    private int defesa;
    
    //Métodos
    public void apresentar() {
        System.out.println("Olá, eu sou " + this.nome + ", tenho " + this.pontosDeVida + " de vida, " + this.forca + " de força e "
                + this.defesa + " de defesa.");
    }
    
    public void atacar(personagem alvo) {
        int dano = this.forca - alvo.defesa;
        if (dano < 0)
            dano = 0; //Não permite dano negativo
        alvo.pontosDeVida -= dano;
        System.out.println(this.nome + " atacou " + alvo.nome + " causando " + dano + " de dano. ");

    }

    //Encapsulamento
    public void setNome(String novoNome){
        this.nome = novoNome;
        this.pontosDeVida = 100;
        this.forca = 20;
        this.defesa = 15;
    }
}
