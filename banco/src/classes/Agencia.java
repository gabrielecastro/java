package classes;

public class Agencia {
    public int codigo;
    public String nome_ag;
    public String endereco;
    public String nome_gerente;
    public String movimentacao;

    public Agencia(int codigo, String nome_ag, String endereco, String nome_gerente, String movimentacao) {
        this.codigo = codigo;
        this.nome_ag = nome_ag;
        this.endereco = endereco;
        this.nome_gerente = nome_gerente;
        this.movimentacao = movimentacao;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_ag() {
        return nome_ag;
    }
    public void setNome_ag(String nome_ag) {
        this.nome_ag = nome_ag;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome_gerente() {
        return nome_gerente;
    }
    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

    public String getMovimentacao() {
        return movimentacao;
    }
    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void imprimir() {
        System.out.println("Dados da agência ");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome_ag);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nome gerente: " + nome_gerente);
        System.out.println("Movimentação: " + movimentacao);
    }
}
