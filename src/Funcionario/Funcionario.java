package Funcionario;

import java.time.Duration;
import java.time.LocalDateTime;

public class Funcionario {
    private double bancoHoras;
    private String nome;
    private double horas;
    private double valorSalario;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        if (salario > 0) {
            this.valorSalario = salario;
        }

    }

    public double aumentarSalario(double porcentagem){
        this.valorSalario = valorSalario + (valorSalario * (porcentagem/100));
        return this.valorSalario;
    }

    public long registrarPonto(LocalDateTime entrada, LocalDateTime saida){
        Duration duracao = Duration.between(entrada, saida);
        long horasTrabalhadas = duracao.toHours();

        this.horas += horasTrabalhadas;

        return horasTrabalhadas;

    }

    public double fazerPagamento(){
        if (this.horas >= 100) {
            this.bancoHoras += horas - 100;
            this.horas = 0;
            return 100*this.valorSalario;
        }

        double valorPago = horas * valorSalario;
        horas = 0;
        return valorPago;

    }

    public double pagamentoBancoDeHoras(){
        this.valorSalario *=  2;
        this.bancoHoras = 0;
        return this.valorSalario;
    }
}
