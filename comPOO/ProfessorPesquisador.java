// ProfessorPesquisador.java
public class ProfessorPesquisador extends Professor {
    private static final double SALARIO_BASE = 5000.0;
    private static final double BOLSA_POR_PROJETO = 2000.0;
    private int projetosAtivos;

    public ProfessorPesquisador(String nome, int projetosAtivos) {
        super(nome);
        this.projetosAtivos = Math.max(0, projetosAtivos);
    }

    @Override
    public double calcularPagamento() {
        return SALARIO_BASE + (BOLSA_POR_PROJETO * projetosAtivos);
    }

    public int getProjetosAtivos() {
        return projetosAtivos;
    }
}
