public class Caminhada extends Atividades {
    private String dificuldade;
    public Caminhada(int horario, int quarto, String instrutor, int duracaoEst, int duracaoTotal, int taxa, String dificuldade) {
        super(horario, quarto, instrutor, duracaoEst, duracaoTotal, taxa = 10);
        setdificuldade(dificuldade);
    }

    public void setdificuldade(String dificuldade)   {
        this.dificuldade = dificuldade;
        if (dificuldade != "Fácil" && dificuldade != "Moderado" && dificuldade != "Exigente") {
            try {
                throw new NivelDificuldadeException("Essa dificuldade não existe");
            } catch (NivelDificuldadeException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public class NivelDificuldadeException extends Exception {
        public NivelDificuldadeException (String errorMessage){
            super(errorMessage);
        }
    }
}