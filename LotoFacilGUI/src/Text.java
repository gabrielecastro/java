import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Text extends JPanel {
    private JLabel welcomeText;
    private JLabel descriptionText;

    public Text() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        welcomeText = new JLabel();
        descriptionText = new JLabel();
        add(welcomeText);
        add(descriptionText);

        setBackground(new Color(10, 9, 8));
        welcomeText.setAlignmentX(CENTER_ALIGNMENT);
        descriptionText.setAlignmentX(CENTER_ALIGNMENT);

        setText(welcomeText,"Bem Vindo ao LotoFácil!", 28);
        setText(descriptionText, "Escolha o tipo de aposta que você irá fazer hoje!", 16);
    }

    private void setText(JLabel typeText, String text, int size) {
        typeText.setText(text);
        typeText.setFont(new Font ("baskerville", Font.PLAIN, size));
        typeText.setHorizontalAlignment(SwingConstants.CENTER);
        typeText.setForeground(new Color(233,236,239));
    }
}

