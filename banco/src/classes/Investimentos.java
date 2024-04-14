package classes;

public class Investimentos {
    public String agencia;
    public String cliente;
    public String conta;
    public String gerente;
    public double saldo;
    public double investimento;

    public Investimentos(
            String agencia, String cliente, String conta, String gerente, double saldo, double investimento) {
        this.agencia = agencia;
        this.cliente = cliente;
        this.conta = conta;
        this.gerente = gerente;
        this.saldo = saldo;
        this.investimento = investimento;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInvestimento() {
        return investimento;
    }
    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public void imposto_investimento() {

    }

    public String verifica_saldo() {
        return "Seu saldo é de: " + saldo;
    }

    public void imprimir() {
        System.out.println("Dados do investimento: ");
        System.out.println("Agência: " + agencia);
        System.out.println("Cliente: " + cliente);
        System.out.println("Conta: " + conta);
        System.out.println("Gerente: " + gerente);
        System.out.println("Saldo: " + saldo);
        System.out.println("Investimento: " + investimento);
    }
}
