// VendedorSenior.java
public class VendedorSenior extends Vendedor {
    private double vendas;
    public static final double META = 10_000.0;
    public static final double BONUS_POR_META = 500.0;

    public VendedorSenior(String nome, double vendas) {
        super(nome);
        this.vendas = vendas;
    }

    private int metasExcedidas() {
        // número de metas completas (cada 10.000). Ex.: 21.000 => 2 metas
        return (int) (vendas / META);
    }

    @Override
    public double calcularComissao() {
        double comissaoPercentual = vendas * 0.08;
        double bonus = metasExcedidas() * BONUS_POR_META;
        return comissaoPercentual + bonus;
    }

    public double getVendas() {
        return vendas;
    }
}
