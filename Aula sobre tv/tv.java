public class tv {
    private int numeroTv;
    private int volume;
    private boolean ligada;
    private canais canalAtual;
    private lista listaCanais;

    public tv(int numeroTv, lista listaCanais) {
        this.numeroTv = numeroTv;
        this.volume = 10; // Volume inicial
        this.ligada = false; // TV inicialmente desligada
        this.listaCanais = listaCanais;
        
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("TV " + numeroTv + " ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("TV " + numeroTv + " desligada.");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }
    }

    public void escolherCanal(int canal){
        
        if(listaCanais.buscarPorNumero(canal) != null){
            this.canalAtual = listaCanais.buscarPorNumero(canal);
        }else{
            System.out.println("Canal não encontrado.");
        }
    }

    public void exibirInfo() {
        if (ligada) {
            System.out.println("Número da TV: " + numeroTv);
            System.out.println("Volume atual: " + volume);
            if (canalAtual != null) {
                System.out.println("Número da TV: " + numeroTv);
                System.out.println("Volume atual: " + volume);
                if (canalAtual != null) {

                    canalAtual.exibirInfo();
                }else {
                    System.out.println("A TV está desligada.");
                }

            }
        }
    }
    //TODO criar funções para adicionar canais
}
