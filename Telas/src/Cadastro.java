import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {
    public Cadastro() {

    }

    public static void abrirJanela() {
        JFrame novaJanela = new JFrame("Nova Janela de Cadastro");
        novaJanela.setSize(400, 300);
        novaJanela.setLocationRelativeTo(null);
        novaJanela.setVisible(true);


        // Criando o formulário de cadastro
        JPanel panel = new JPanel(new GridLayout(6, 2));
        novaJanela.add(panel);

        JLabel lblTitulo = new JLabel("Título:");
        JTextField txtTitulo = new JTextField();
        JLabel lblAutor = new JLabel("Autor:");
        JTextField txtAutor = new JTextField();
        JLabel lblGen = new JLabel("Gênero:");
        JTextField txtGen = new JTextField();
        JLabel lblAno = new JLabel("Ano de publicação:");
        JTextField txtAno = new JTextField();
        JLabel lblEditora = new JLabel("Editora:");
        JTextField txtEditora = new JTextField();
        JButton btnSalvar = new JButton("Salvar");

        panel.add(lblTitulo);
        panel.add(txtTitulo);
        panel.add(lblAutor);
        panel.add(txtAutor);
        panel.add(lblGen);
        panel.add(txtGen);
        panel.add(lblAno);
        panel.add(txtAno);
        panel.add(lblEditora);
        panel.add(txtEditora);
        panel.add(new JLabel()); // Espaço em branco para alinhar o botão
        panel.add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Quando o botão "Salvar" for clicado, obter os valores dos campos e exibir em uma nova janela
                DadosCadastro dados = new DadosCadastro(
                        txtTitulo.getText(),
                        txtAutor.getText(),
                        txtGen.getText(),
                        txtAno.getText(),
                        txtEditora.getText()
                );
                VisualizacaoDados.abrirJanela(dados);
            }
        });

        novaJanela.setVisible(true);
    }
}
