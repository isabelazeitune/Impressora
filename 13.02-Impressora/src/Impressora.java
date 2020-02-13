import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> listaDeImprimiveis = new ArrayList<>();
    // significa que todas as classes implementadas pela interface Imprimivel podem ser adicionadas na lista

    public Impressora(/*List<Imprimivel> listaDeImprimiveis*/) {
        //this.listaDeImprimiveis = listaDeImprimiveis;
        // deixar construtor vazio para não precisar definir lista ao definir impressora
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