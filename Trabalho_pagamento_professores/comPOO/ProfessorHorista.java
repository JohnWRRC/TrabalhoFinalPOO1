// ProfessorHorista.java
public class ProfessorHorista extends Professor {
    private static final double VALOR_HORA = 85.0;
    private static final int MAX_HORAS = 160;
    private int horasMes;

    public ProfessorHorista(String nome, int horasMes) {
        super(nome);
        this.horasMes = Math.max(0, horasMes);
    }

    @Override
    public double calcularPagamento() {
        int horasPagas = Math.min(horasMes, MAX_HORAS);
        return horasPagas * VALOR_HORA;
    }

    public int getHorasMes() {
        return horasMes;
    }
}
