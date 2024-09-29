package exercicio;

public class Elevador {

    private int andarAtual = 0;
    private int andarMaximo;
    private int andarMinimo;

    public void setAndarMaximo(int valor){
        this.andarMaximo = valor;
    }

    public void setAndarMinimo(int valor){
        this.andarMinimo = valor;
    }

    public void subir(){
        if (andarAtual < andarMaximo) {
            andarAtual++;
        }
    }

    public void descer(){
        if (andarAtual > andarMinimo) {
            andarAtual--;
        }
    }

    public int mostrarAndar(){
        return andarAtual;
    }

}
