public class PasseioCavalo extends Atividades implements Segurança{
    private int id;
    public PasseioCavalo(int horario, int quarto, String instrutor, int duracaoEst, int duracaoTotal, int taxa, int id) {
        super(horario, quarto, instrutor, duracaoEst, duracaoTotal, taxa = 60);
        this.id = id;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Capacete";
    }
}