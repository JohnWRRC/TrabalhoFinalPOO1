// Main.java
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        List<Professor> professores = new ArrayList<>();
        professores.add(new ProfessorHorista("Ana Silva", 120));
        professores.add(new ProfessorHorista("Bruno Costa", 200)); // acima do máximo -> limitado a 160
        professores.add(new ProfessorDedicacaoExclusiva("Carla Pereira", 1));
        professores.add(new ProfessorDedicacaoExclusiva("Diego Souza", 2));
        professores.add(new ProfessorPesquisador("Elisa Rocha", 3));
        professores.add(new ProfessorPesquisador("Fábio Lima", 0));

        System.out.println("=== Pagamentos ===");
        double total = 0;
        for (Professor p : professores) {
            double pag = p.calcularPagamento();
            total += pag;
            System.out.println(p + " -> " + df.format(pag));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total da folha: " + df.format(total));
    }
}
