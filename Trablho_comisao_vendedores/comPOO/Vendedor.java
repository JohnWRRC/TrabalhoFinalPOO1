// Vendedor.java
public abstract class Vendedor {
    protected String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    // retorna o pagamento/comissão do vendedor (valor em R$)
    public abstract double calcularComissao();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s'}", this.getClass().getSimpleName(), nome);
    }
}
