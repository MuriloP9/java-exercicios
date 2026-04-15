package entities;

public class ContaBancaria {

    private static final double TAXA_SAQUE = 5;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial < 0 ? 0 : saldoInicial;
        /*Se o saldo inicial for menor que 0 → saldo vira 0
          Senão → saldo recebe o valor informado*/
    }

    public String getTitular() {
        return titular;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Metodo de depósito
    public void depositar(double valor) {
         if(valor > 0){
            saldo += valor;
        } else {
             System.out.println("Você não pode depositar um saldo negativo!");
         }
    }

    // Metodo de saque
    public boolean sacar(double valor) {
        if (valor <= 0) {
           return false;
        }
        if (valor + TAXA_SAQUE > saldo) {
            return false;
        }
            saldo -= valor + TAXA_SAQUE; // saldo = saldo - valor + taxa
            return true;
        }
    }

