// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contrato contrato1 = new Contrato("contrato1", "tipoDeContrato1");
        Foto foto1 = new Foto("foto1", "tipoDeFoto1");
        Documento documento1 = new Documento("documento1", "tipoDeDocumento1");

        //List<Imprimivel> lista1 = new ArrayList<>();
        //Impressora impressora1 = new Impressora(lista1);
        Impressora impressora1 = new Impressora();

        impressora1.adicionarImprimivel(contrato1);
        impressora1.adicionarImprimivel(foto1);
        impressora1.adicionarImprimivel(documento1);
        impressora1.imprimirTudo();

    }
}
