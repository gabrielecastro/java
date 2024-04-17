public class Pessoa {
    String nome;
    String endereco;
    String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone;
    }
}
