public class App {
    public static void main (String[] args){

        Titulo t1 = new Filme("Gente Grande", 2010, true , 160);
        t1.exibirInfo();
        t1.avalia(9.0);
        t1.avalia(9.5);
        System.out.println(t1.pegarMedia());

        Titulo s1 = new Serie("Breaking Bead", 2003, true, 9, 10, 60);
        s1.exibirInfo();
    }
}
