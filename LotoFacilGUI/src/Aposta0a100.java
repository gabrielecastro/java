import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.Random;

public class Aposta0a100 extends JPanel {
    Random random = new Random();
    int drawnNumber = random.nextInt(101);
    private final Award awardPanel;

    public Aposta0a100(Award awardPanel) {
        this.awardPanel = awardPanel;
        organizeLayout();
        createButtons();
    }

    public void organizeLayout() {
        setLayout(new GridLayout(4, 25, 5, 5));
        setBackground(new Color(10, 9, 8));
        setBorder(new EmptyBorder(30, 30, 0, 30));
    }

    public void verificaAposta(JButton button) {
        int betNumber = Integer.parseInt(button.getText());
        if (betNumber == drawnNumber) {
            awardPanel.setText("Você ganhou R$ 1.000,00 reais.");
        } else {
            awardPanel.setText("Que pena! O número sorteado foi: " + drawnNumber + ".");
        }
    }

    public void createButtons() {
        // Loop para criar e adicionar botões de A a Z
        for (int num = 0; num <= 100; num++) {
            JButton button = new JButton(String.valueOf(num));
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
        button.setPreferredSize(new Dimension(30, 50));
    }
}
