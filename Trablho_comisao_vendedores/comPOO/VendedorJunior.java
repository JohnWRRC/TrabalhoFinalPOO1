// VendedorJunior.java
public class VendedorJunior extends Vendedor {
    private double vendas;

    public VendedorJunior(String nome, double vendas) {
        super(nome);
        this.vendas = vendas;
    }

    @Override
    public double calcularComissao() {
        // Júnior: 5% do total de vendas
        return vendas * 0.05;
    }

    public double getVendas() {
        return vendas;
    }
}
