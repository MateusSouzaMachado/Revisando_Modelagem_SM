package carteira_completo;

public class CarteiraApp {

    public static void main(String[] args) {
        Carteira carteira1 = new Carteira();

        carteira1.receita(100);
        carteira1.despesa(1000);
        System.out.println(carteira1.getSaldo());

        carteira1.despesa(60);
        System.out.println(carteira1.getSaldo());

        carteira1.despesa(20);
        System.out.println(carteira1.getSaldo());
    }
}
