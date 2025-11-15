// GerenteComercial.java
import java.util.List;

public class GerenteComercial extends Vendedor {
    public static final double SALARIO_FIXO = 3000.0;
    private List<Vendedor> equipe;

    public GerenteComercial(String nome, List<Vendedor> equipe) {
        super(nome);
        this.equipe = equipe;
    }

    private double totalVendasEquipe() {
        double total = 0.0;
        for (Vendedor v : equipe) {
            // tentativa segura: se o vendedor tiver método getVendas, usamos reflexivamente
            if (v instanceof VendedorJunior) {
                total += ((VendedorJunior) v).getVendas();
            } else if (v instanceof VendedorSenior) {
                total += ((VendedorSenior) v).getVendas();
            }
            // outros tipos (ex.: outro gerente) são ignorados ou podem ser tratados conforme regra
        }
        return total;
    }

    @Override
    public double calcularComissao() {
        // Gerente: R$ 3.000,00 fixo + 2% sobre o total da equipe
        double totalEquipe = totalVendasEquipe();
        return SALARIO_FIXO + (totalEquipe * 0.02);
    }
}
