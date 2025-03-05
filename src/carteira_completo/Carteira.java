package carteira_completo;

public class Carteira {

    private float saldo = 0;
    private String nome;

        public float despesa(float valor){
            if(this.saldo >= valor){
                if (valor < this.saldo * 0.5 ) {
                    this.saldo -= valor;
                }
                
            }
            return saldo;
        }
        
        public float receita(float valor){
            this.saldo += valor;
            return this.saldo;
        }

        public float getSaldo(){

            return saldo;
        }


    }

