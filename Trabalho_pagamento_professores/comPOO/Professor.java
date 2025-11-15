// Professor.java
public abstract class Professor {
    protected String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    // cada subclasse implementa sua regra de pagamento
    public abstract double calcularPagamento();

    @Override
    public String toString() {
        return nome + " - " + this.getClass().getSimpleName();
    }
}
