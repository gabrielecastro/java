import javax.swing.*;
import java.awt.*;

class VisualizacaoDados {
    public static void abrirJanela(DadosCadastro dados) {
        JFrame novaJanela = new JFrame("Dados do Cadastro");
        novaJanela.setSize(300, 200);
        novaJanela.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 1));
        novaJanela.add(panel);

        panel.add(new JLabel("Título: " + dados.getTitulo()));
        panel.add(new JLabel("Autor: " + dados.getAutor()));
        panel.add(new JLabel("Gênero: " + dados.getGenero()));
        panel.add(new JLabel("Ano de publicação: " + dados.getAno()));
        panel.add(new JLabel("Editora: " + dados.getEditora()));

        novaJanela.setVisible(true);
    }
}