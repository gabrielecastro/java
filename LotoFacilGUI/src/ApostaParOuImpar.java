import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ApostaParOuImpar extends JPanel {

    private final Award awardPanel;

    public ApostaParOuImpar(Award awardPanel) {
        this.awardPanel = awardPanel;
        organizeLayout();
    }

    private void verificaAposta(int numberEntered) {
        if (numberEntered % 2 == 0) {
            awardPanel.setText("Você ganhou R$ 100,00 reais.");
        } else {
            awardPanel.setText("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }

    }

    private void organizeLayout() {
        setBackground(new Color(10, 9, 8));
        setBorder(new EmptyBorder(30, 30, 0, 30));

        JTextField textField = new JTextField(20);
        styledInput(textField);

        add(textField);

        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("[0-9]+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("[0-9]+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        createButton(textField);
    }

    private void createButton(JTextField textField) {
        JButton buttonApostar = new JButton("Apostar");
        styledButton(buttonApostar);

        buttonApostar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberEntered = Integer.parseInt(textField.getText());
                verificaAposta(numberEntered);
            }
        });

        add(buttonApostar);
    }

    private void styledInput(JTextField textField) {
        textField.setPreferredSize(new Dimension(100, 40));
        textField.setFont(new Font("baskerville", Font.PLAIN, 12));
        textField.setBorder(null);
        textField.setBorder(new EmptyBorder(5, 10, 5, 10));
        textField.setBackground(new Color(22,26,29));
        textField.setForeground(new Color(233,236,239));
    }

    private void styledButton(JButton button) {
        button.setPreferredSize(new Dimension(100, 40));
        button.setFont(new Font("baskerville", Font.PLAIN, 12));
        button.setBackground(new Color(92, 128, 1));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false); // Remove a pintura do foco
        button.setBorderPainted(false); // Remove a borda
    }

}
