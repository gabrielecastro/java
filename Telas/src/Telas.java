import javax.swing.*;
import java.awt.*;

public class Telas extends JFrame {

    public Telas() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        organizarLayout();
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        add(panel, BorderLayout.CENTER);

        // Adicionar o menu à janela principal
        JMenuBar menuBar = NavBar.createMenuBar();
        setJMenuBar(menuBar);

        // Atualizar layout
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new Telas();
    }
}