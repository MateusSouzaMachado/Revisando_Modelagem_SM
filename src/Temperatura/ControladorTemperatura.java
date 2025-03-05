package Temperatura;

public class ControladorTemperatura {

    private float temperaturaAmbiente = 0;
    private float temperaturaMaxima = 0;

    public ControladorTemperatura(float temperaturaMaxima){
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void aumentarTemperatura(float valor){
       if (valor > 0) {
        this.temperaturaAmbiente += valor;
            if (this.temperaturaAmbiente > this.temperaturaMaxima){
            this.temperaturaAmbiente = this.temperaturaMaxima;
            
            }else{

            }
        }
    
    } 

    public void diminuirTemperatura(float valor){
        this.temperaturaAmbiente -= valor;

    }

    public void setTemperaturaMaxima(float valor){
        this.temperaturaMaxima = valor;
    }

    public float getTemperaturaAmbiente(){
        return this.temperaturaAmbiente;
    }

    public float getTemperaturaMaxima(){
        return this.temperaturaMaxima;
    }
}
