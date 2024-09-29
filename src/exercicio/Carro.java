package exercicio;

public class Carro {

    private double velocidadeAtual;
    private String marca;

    public void setMarca (String nome){
        this.marca = nome;
    }

    public void acelerar(int valor){
        this.velocidadeAtual += valor;
    }

    public void frear(int valor){
        this.velocidadeAtual -= valor;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    public String exibirVelocidade(){
        return String.format("Velocidade Atual: " + velocidadeAtual + " \n Marca: %s", marca);
    }

}
