public class Serie extends Titulo{
    private int temporadas;
    private int episodiosTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoLanacamento, boolean incluidoPlano, int temporadas, int episodiosTemporada, int minutosPorEpisodio) {
        super(nome, anoLanacamento, incluidoPlano);
        this.temporadas = temporadas;
        this.episodiosTemporada = episodiosTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Série: " + getNome() + " | Lançada em: " + getAnoLancamento() + " | Temporadas: " + temporadas + " | Minutos por episódio: " + minutosPorEpisodio);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
