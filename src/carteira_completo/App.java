package carteira_completo;



public class App {
    public static void main(String[] args) throws Exception {
        
        Carteira carteiraSamuel = new Carteira();
        carteiraSamuel.receita(50);
            
        System.out.println(carteiraSamuel.getSaldo());

        carteiraSamuel.despesa(26);
        carteiraSamuel.despesa(0);
        carteiraSamuel.despesa(0);

        System.out.println(carteiraSamuel.getSaldo());

        carteiraSamuel.despesa(0);
        System.out.println(carteiraSamuel.getSaldo());
    }
}
