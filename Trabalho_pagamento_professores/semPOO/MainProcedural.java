import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainProcedural {

    // "Struct" simples para agrupar dados (não há herança)
    static class RegistroProfessor {
        String nome;
        String tipo; // "HORISTA", "DEDICACAO", "PESQUISADOR"
        int horasMes;        // usado só para HORISTA
        int numTitulacoes;   // usado só para DEDICACAO
        int projetosAtivos;  // usado só para PESQUISADOR

        public RegistroProfessor(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return nome + " - " + tipo;
        }
    }

    // Função central que calcula pagamento com base no campo 'tipo'
    static double calcularPagamento(RegistroProfessor r) {
        switch (r.tipo) {
            case "HORISTA": {
                final double VALOR_HORA = 85.0;
                final int MAX_HORAS = 160;
                int horasPagas = Math.min(Math.max(0, r.horasMes), MAX_HORAS);
                return horasPagas * VALOR_HORA;
            }
            case "DEDICACAO": {
                final double SALARIO_BASE = 8000.0;
                final double ADICIONAL_TITULACAO = 1500.0;
                int titulacoes = Math.max(0, r.numTitulacoes);
                return SALARIO_BASE + (ADICIONAL_TITULACAO * titulacoes);
            }
            case "PESQUISADOR": {
                final double SALARIO_BASE = 5000.0;
                final double BOLSA_POR_PROJETO = 2000.0;
                int proj = Math.max(0, r.projetosAtivos);
                return SALARIO_BASE + (BOLSA_POR_PROJETO * proj);
            }
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + r.tipo);
        }
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        // Lista "heterogênea" porém sem herança — todos são registros com campo tipo
        List<RegistroProfessor> lista = new ArrayList<>();

        RegistroProfessor r1 = new RegistroProfessor("Ana Silva", "HORISTA");
        r1.horasMes = 120;
        lista.add(r1);

        RegistroProfessor r2 = new RegistroProfessor("Bruno Costa", "HORISTA");
        r2.horasMes = 200; // será limitado a 160
        lista.add(r2);

        RegistroProfessor r3 = new RegistroProfessor("Carla Pereira", "DEDICACAO");
        r3.numTitulacoes = 1;
        lista.add(r3);

        RegistroProfessor r4 = new RegistroProfessor("Diego Souza", "DEDICACAO");
        r4.numTitulacoes = 2;
        lista.add(r4);

        RegistroProfessor r5 = new RegistroProfessor("Elisa Rocha", "PESQUISADOR");
        r5.projetosAtivos = 3;
        lista.add(r5);

        RegistroProfessor r6 = new RegistroProfessor("Fábio Lima", "PESQUISADOR");
        r6.projetosAtivos = 0;
        lista.add(r6);

        System.out.println("=== Pagamentos (versão PROCEDURAL) ===");
        double total = 0;
        for (RegistroProfessor rp : lista) {
            double pag = calcularPagamento(rp);
            total += pag;
            System.out.println(rp + " -> " + df.format(pag));
        }
        System.out.println("--------------------------------------");
        System.out.println("Total da folha: " + df.format(total));
    }
}
