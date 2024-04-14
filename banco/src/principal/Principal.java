package principal;

import classes.Cliente;
import classes.Conta;
import classes.Agencia;
import classes.Investimentos;

public class Principal {
    public static void main(String[] args) {
        // cria um cliente
        Cliente cliente1 = new Cliente("Gabriele", 22, "feminino", "Rua Flor", "Verona");
        cliente1.imprimir();

        // cria uma conta
        Conta conta1 = new Conta(2404, 1095.47);
        conta1.depositar(32.50);
        conta1.sacar(300);
        conta1.imprimir();

        // cria uma agencia
        Agencia agenciaNu = new Agencia(0000, "Nubank", "São Paulo", "Wlad", "1");
        agenciaNu.imprimir();

        // cria um investimento
        Investimentos investimentoCDB = new Investimentos("agenciaNu", "Gabriele", "0000", "Wlad", 897.55, 100);
        investimentoCDB.imprimir();

    }
}
