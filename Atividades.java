import java.util.*;
public abstract class Atividades {
    private int horario;
    private int quarto;
    private String instrutor;
    private int duracaoEst;
    private int duracaoTotal;
    private int taxa; //Em vez dessa forma talvez fosse pra fazer um método pra acrescer valor mas não tem preço nas atividades...

    public Atividades (int horario, int quarto,  String instrutor, int duracaoEst, int duracaoTotal, int taxa) {
        setHorario(horario);
        setQuarto(quarto);
        setInstrutor(instrutor);
        setDuracaoEst(duracaoEst);
        setDuracaoTotal(duracaoTotal);
        setTaxa(taxa);
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getDuracaoEst() {
        return duracaoEst;
    }

    public void setDuracaoEst(int duracaoEst) {
        this.duracaoEst = duracaoEst;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(int duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
}

