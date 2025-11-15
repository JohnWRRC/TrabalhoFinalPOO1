// ProfessorDedicacaoExclusiva.java
public class ProfessorDedicacaoExclusiva extends Professor {
    private static final double SALARIO_BASE = 8000.0;
    private static final double ADICIONAL_TITULACAO = 1500.0;
    private int numTitulacoes;

    public ProfessorDedicacaoExclusiva(String nome, int numTitulacoes) {
        super(nome);
        this.numTitulacoes = Math.max(0, numTitulacoes);
    }

    @Override
    public double calcularPagamento() {
        return SALARIO_BASE + (ADICIONAL_TITULACAO * numTitulacoes);
    }

    public int getNumTitulacoes() {
        return numTitulacoes;
    }
}
