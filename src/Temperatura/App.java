package Temperatura;

public class App {
    public static void main(String[] args) throws Exception {
       
        ControladorTemperatura sala = new ControladorTemperatura(100f);

        sala.setTemperaturaMaxima(100);
        sala.aumentarTemperatura(111);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.diminuirTemperatura(100);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.aumentarTemperatura(50);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.aumentarTemperatura(33.9f);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.diminuirTemperatura(85.9f);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.aumentarTemperatura(700);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.setTemperaturaMaxima(700);
        sala.aumentarTemperatura(451.98f);
        System.out.println(sala.getTemperaturaAmbiente());
        sala.aumentarTemperatura(-85);
        System.out.println(sala.getTemperaturaAmbiente());


    }
}
