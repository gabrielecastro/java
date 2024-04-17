import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        Scanner scn = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("Digite a opção desejada!");
            System.out.println("1 - Cadastrar pessoa na agenda");
            System.out.println("2 - Listar pessoas da agenda");
            System.out.println("0 - Sair");
            opcao = scn.nextInt();

            if (opcao == 1) {
                cadastrarPessoas(agendaPessoas);
            } else if (opcao == 2) {
                listarPessoas(agendaPessoas);
            } else if (opcao == 0) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

    }

    private static void listarPessoas(ArrayList<Pessoa> agendaPessoas) {
        for (Pessoa pessoa : agendaPessoas) {
            System.out.println(pessoa.toString());
        }
    }

    private static void cadastrarPessoas(ArrayList<Pessoa> agendaPessoas) {
        String nome = "";
        String endereco = "";
        String telefone = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o nome");
        nome = scn.nextLine();
        System.out.println("Digite o endereco");
        endereco = scn.nextLine();
        System.out.println("Digite o telefone");
        telefone = scn.nextLine();

        Pessoa pessoa = new Pessoa(nome, endereco, telefone);
        agendaPessoas.add(pessoa);
    }
}