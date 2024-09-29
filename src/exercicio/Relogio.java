package exercicio;

public class Relogio {

    private int horas;
    private int minutos;

    public void acertarRelogio(int horas, int minutos){
        if (horas >=0 && horas < 24 && minutos < 60 && minutos >= 0) {
            this.horas = horas;
            this.minutos = minutos;
        }else{
            System.out.println("Horas ou minutos invalidos");
        }
    }

    public void avancarMinutos(){
        this.minutos++;
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        if (horas == 24) {
            horas = 0;
        }
    }

    public String exibirHora(){
        return String.format("%02d:%02d", this.horas, this.minutos);
    }
}
