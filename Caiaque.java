public class Caiaque extends Atividades implements Segurança{
    private int id;
    public Caiaque(int horario, int quarto, String instrutor, int duracaoEst, int duracaoTotal, int taxa, int id) {
        super(horario, quarto, instrutor, duracaoEst, duracaoTotal, taxa = 20);
        this.id = id;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Colete salva-vidas";
    }
}