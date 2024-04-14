package classes;

public class Conta {
    public int numero;
    public double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor_saque) {
        if (valor_saque < saldo) {
            saldo = saldo - valor_saque;
            System.out.println("Saque no valor de " + valor_saque + " efetuado com sucesso!");
        } else {
        System.out.println("Você não possui saldo suficiente para realizar esse saque!");
        }
    }

    public void depositar(double valor_deposito) {
        saldo = saldo + valor_deposito;
        System.out.println("Depósito no valor de " + valor_deposito + " realizado com sucesso!");
    }

    public void imprimir() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: " + saldo + " reais");
    }
}
