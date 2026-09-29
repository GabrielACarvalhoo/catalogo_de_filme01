public class Filme extends Titulo implements Classificavel{
    public Filme(String nome, int anoLanacamento, boolean incluidoPlano, int duracaoMinutos) {
        super(nome, anoLanacamento, incluidoPlano);
        this.duracaoMinutos = duracaoMinutos;
    }

    private int duracaoMinutos;

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + getNome() + " | Lançado em: " + getAnoLancamento() + " | Duração: " + duracaoMinutos + " minutos");
    }

    @Override
    public int getClassificacao() {
        return (int) (pegarMedia() / 2);
    }
}
