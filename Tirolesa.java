public class Tirolesa extends Atividades implements Segurança{
    private String tipo;
    public Tirolesa(int horario, int quarto, String instrutor, int duracaoEst, int duracaoTotal, int taxa, String tipo) {
        super(horario, quarto, instrutor, duracaoEst, duracaoTotal, taxa = 50);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }


        public void setTipo(String tipo)   {
                this.tipo = tipo;
                if (tipo != "Montanha" && tipo != "Lago") {
                    try {
                        throw new TipoTirolesaException("Não tem esse tipo de tirolesa");
                    } catch (TipoTirolesaException e) {
                        throw new RuntimeException(e);
                    }
                }
        }

    public class TipoTirolesaException extends Exception {
        public TipoTirolesaException (String errorMessage){
            super(errorMessage);
        }
    }

    @Override
    public String equipamentoSeguranca() {
        if(tipo == "Montanha") {
            return "Capacete";
        }
        return "";
    }

}
