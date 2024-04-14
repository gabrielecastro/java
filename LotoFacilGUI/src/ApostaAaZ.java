import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ApostaAaZ extends JPanel {
    String awardWinningLyrics = "G";
    private final Award awardPanel;

    public ApostaAaZ(Award awardPanel) {
        this.awardPanel = awardPanel;
        organizeLayout();
        createButtons();
    }

    public void organizeLayout() {
        setLayout(new GridLayout(3, 10, 4, 4));
        setBackground(new Color(10, 9, 8));
        setBorder(new EmptyBorder(30, 30, 0, 30));
    }

    public void verificaAposta(JButton button) {
        String betLetter = button.getText();
        if (Objects.equals(betLetter, awardWinningLyrics)) {
            awardPanel.setText("Você ganhou R$ 500,00 reais.");
        } else {
            awardPanel.setText("Que pena! A letra sorteada foi: " + awardWinningLyrics + ".");
        }
    }

    public void createButtons() {
        // Loop para criar e adicionar botões de A a Z
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            JButton button = new JButton(String.valueOf(letra));
            styledButtons(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    verificaAposta(button);
                }
            });
            add(button);
        }
    }

    public void styledButtons(JButton button) {
        button.setFont(new Font("baskerville", Font.PLAIN, 16));
        button.setOpaque(true);
        button.setFocusPainted(false);
        button.setBackground(new Color(26, 67, 1));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(50, 50));
    }
}
