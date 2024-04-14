import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Award extends JPanel {
    private JLabel text;

    public Award() {
        text = new JLabel("");
        add(text);

        setBackground(new Color(10, 9, 8));
    }

    public void setText(String message) {
        System.out.println("entrou" + message);

        text.setText(message);
        text.setFont(new Font ("baskerville", Font.PLAIN, 16));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setForeground(new Color(233,236,239));

        revalidate();
        repaint();
    }

}

