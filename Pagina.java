public class Pagina {
    private int paginaAcessada;
    private int momentoDeAcesso;
    private String leituraOuEscrita;
    private boolean acessadoNovamente;
    private int tempoParaSerAcessadoNovamente;

    // Quando receber do documento, transformar String para número
    public Processo(int paginaAcessada, int momentoDeAcesso, String leituraOuEscrita){
        this.paginaAcessada = paginaAcessada;
        this.momentoDeAcesso = momentoDeAcesso;
        this.leituraOuEscrita = leituraOuEscrita;
        acessadoNovamente = false;
        tempoParaSerAcessadoNovamente = 0;
    }

    public int getPaginaAcessada(){
        return paginaAcessada;
    }

    public int getMomentoDeAcesso(){
        return momentoDeAcesso;
    }

    public String getLeituraOuEscrita(){
        return leituraOuEscrita;
    }

    public boolean getAcessadoNovamente(){
        return acessadoNovamente;
    }

    public int getTempoParaSerAcessadoNovamente(){
        return tempoParaSerAcessadoNovamente;
    }

    public void setAcessadoNovamente(boolean isOrNot){
        acessadoNovamente = isOrNot;
    }

    public void setPaginaAcessada(int pagina){
        paginaAcessada = pagina;
    }

    public void setMomentoDeAcesso(int momento){
        momentoDeAcesso = momento;
    }

    public void aumentarTempoAcessoNovamente(){
        tempoParaSerAcessadoNovamente =+ 1;
    }

    public Pagina(Pagina original){
        this.paginaAcessada = original.paginaAcessada;
        this.momentoDeAcesso = original.momentoDeAcesso;
        this.leituraOuEscrita = original.leituraOuEscrita;
        acessadoNovamente = false;
        tempoParaSerAcessadoNovamente = 0;
    }
}   