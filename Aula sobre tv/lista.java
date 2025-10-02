package aula.sobre.tv;

import java.util.ArrayList;

public class lista {
    private ArrayList<canais> canais = new ArrayList<>();

    public void adicionarCanal(canais canal) {
        canais.add(canal);
    }

    public void removerCanal(canais canal) {
        canais.remove(canal);
    }
    public canais buscarPorNumero(int numero) {
        for (canais canal : canais) {
            if (canal.getNumero() == numero) {
                return canal;
            }
        }
        return null; // se não achar
    }

    public void listarCanais() {
        for (canais canal : canais) {
            canal.exibirInformacoes();
        }
    }

    public ArrayList<canais> getCanais() {
        return canais;
    }
}
