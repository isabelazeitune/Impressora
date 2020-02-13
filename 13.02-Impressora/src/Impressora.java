import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> listaDeImprimiveis = new ArrayList<>();

    public Impressora(List<Imprimivel> listaDeImprimiveis) {
        this.listaDeImprimiveis = listaDeImprimiveis;
    }

    public void imprimirTudo() {
        for(int i=0; i<listaDeImprimiveis.size(); i++) {
            listaDeImprimiveis.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        listaDeImprimiveis.add(umImprimivel);
    }

}