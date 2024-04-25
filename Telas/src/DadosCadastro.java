class DadosCadastro {
    private String titulo;
    private String autor;
    private String genero;
    private String ano;
    private String editora;

    public DadosCadastro(String titulo, String autor, String genero, String ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }
}