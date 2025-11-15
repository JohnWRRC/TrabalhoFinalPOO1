// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendedorJunior j1 = new VendedorJunior("Ana", 8000.0);
        VendedorJunior j2 = new VendedorJunior("Paulo", 12000.0);

        VendedorSenior s1 = new VendedorSenior("Marcos", 15000.0);
        VendedorSenior s2 = new VendedorSenior("Laura", 23000.0);

        // gerente com equipe composta por j1, j2, s1, s2
        GerenteComercial g = new GerenteComercial("Roberto", Arrays.asList(j1, j2, s1, s2));

        // Lista polimórfica
        List<Vendedor> vendedores = Arrays.asList(j1, j2, s1, s2, g);

        System.out.println("Relatório de comissões/pagamentos:");
        for (Vendedor v : vendedores) {
            System.out.printf("%s - %s: R$ %.2f%n", v.getClass().getSimpleName(), v.getNome(), v.calcularComissao());
        }

        // Total de desembolso para a empresa
        double totalPagar = vendedores.stream().mapToDouble(Vendedor::calcularComissao).sum();
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);
    }
}
