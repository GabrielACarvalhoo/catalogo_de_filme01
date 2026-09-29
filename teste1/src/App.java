import java.util.ArrayList;

public class App {
    public static void main (String[] args){

        ArrayList<Filme> catalogoFilmes = new ArrayList<>();
        catalogoFilmes.add(new Filme("Gente Grande", 2014, true, 140 ));
        catalogoFilmes.add(new Filme("Star Wars: O Imperio contrataca", 1998, true, 180));


        ArrayList<Serie> catalogoSeries = new ArrayList<>();
        catalogoSeries.add(new Serie("Breaking Bead",2010, true, 10, 8, 60));


        for (int i = 0; i<catalogoFilmes.size(); i++ ) {
            catalogoFilmes.get(i).exibirInfo();
        }


    }
}
