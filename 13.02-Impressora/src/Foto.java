public class Foto implements Imprimivel {
    private String nome;
    private String tipo;

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie.");
        System.out.println("Meu nome é: " + this.nome + " e meu tipo é: " + this.tipo + ".");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
