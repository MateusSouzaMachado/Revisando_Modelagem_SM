package Filme;

public class App {
    public static void main(String[] args) throws Exception {
        
        Filme f1 = new Filme("Harry Potter", 2001, 152, false);

        f1.avalia(10);
        f1.avalia(8.9);
        f1.avalia(7);
        f1.avalia(8);

        System.out.println(f1.pegaMedia());
        System.out.println(f1.exibirFichaTecnica());
    }
}
