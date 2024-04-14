import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BotaoTipoAposta extends JPanel {

    public JButton botaoApostaAaZ;
    public JButton botaoAposta0a100;
    public JButton botaoApostaParOuImpar;
    private JPanel panel;

    Award award;
    Aposta0a100 aposta0a100;
    ApostaAaZ apostaAaZ;
    ApostaParOuImpar apostaParOuImpar;

    public BotaoTipoAposta(JPanel panel, Award award, Aposta0a100 aposta0a100, ApostaAaZ apostaAaZ, ApostaParOuImpar apostaParOuImpar) {
        this.panel = panel;
        this.award = award;
        this.aposta0a100 = aposta0a100;
        this.apostaAaZ = apostaAaZ;
        this.apostaParOuImpar = apostaParOuImpar;

        setLayout(new FlowLayout());
        setBackground(new Color(10, 9, 8));
        setBorder(new EmptyBorder(0, 20, 0, 20));

        createButtons();
        styleButtons();
        addListeners();
        addComponents();
    }

    private void createButtons() {
        botaoAposta0a100 = new JButton("Apostar de 0 a 100");
        botaoApostaAaZ = new JButton("Apostar de A a Z");
        botaoApostaParOuImpar = new JButton("Apostar Par ou Ímpar");
    }

    private void styleButtons() {
        Font fonte = new Font("baskerville", Font.PLAIN, 16);

        botaoAposta0a100.setFont(fonte);
        botaoAposta0a100.setBorderPainted(false);
        botaoAposta0a100.setBackground(new Color(164,22,35));
        botaoAposta0a100.setForeground(Color.WHITE);

        botaoApostaAaZ.setFont(fonte);
        botaoApostaAaZ.setBorderPainted(false);
        botaoApostaAaZ.setBackground(new Color(92,128,1));
        botaoApostaAaZ.setForeground(Color.WHITE);

        botaoApostaParOuImpar.setFont(fonte);
        botaoApostaParOuImpar.setBorderPainted(false);
        botaoApostaParOuImpar.setBackground(new Color(250,149,0));
        botaoApostaParOuImpar.setForeground(Color.WHITE);

        // Definindo altura e largura dos botões
        botaoAposta0a100.setPreferredSize(new Dimension(200, 50));
        botaoApostaAaZ.setPreferredSize(new Dimension(200, 50));
        botaoApostaParOuImpar.setPreferredSize(new Dimension(200, 50));

        botaoAposta0a100.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        botaoApostaAaZ.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        botaoApostaParOuImpar.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
    }

    public void desativarBotao(JButton button) {
        button.setEnabled(false);
    }

    public void ativarBotao(JButton button) {
        button.setEnabled(true);
    }

    public void removeComponents(Component component) {
        panel.remove(component);
    }

    private void addListeners() {
        botaoAposta0a100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeComponents(apostaAaZ);
                removeComponents(apostaParOuImpar);

                ativarBotao(botaoApostaAaZ);
                ativarBotao(botaoApostaParOuImpar);

                panel.add(aposta0a100); // Adiciona ao painel principal
                desativarBotao(botaoAposta0a100);

                panel.revalidate();
                panel.repaint();
            }
        });

        botaoApostaAaZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeComponents(aposta0a100);
                removeComponents(apostaParOuImpar);

                ativarBotao(botaoAposta0a100);
                ativarBotao(botaoApostaParOuImpar);

                panel.add(apostaAaZ);
                desativarBotao(botaoApostaAaZ);

                panel.revalidate();
                panel.repaint();
            }
        });

        botaoApostaParOuImpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeComponents(aposta0a100);
                removeComponents(apostaAaZ);

                ativarBotao(botaoAposta0a100);
                ativarBotao(botaoApostaAaZ);

                panel.add(apostaParOuImpar);
                desativarBotao(botaoApostaParOuImpar);

                panel.revalidate();
                panel.repaint();
            }
        });
    }

    private void addComponents() {
        add(botaoAposta0a100);
        add(botaoApostaAaZ);
        add(botaoApostaParOuImpar);
    }
}
