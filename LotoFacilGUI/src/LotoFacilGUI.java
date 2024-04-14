import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LotoFacilGUI extends JFrame {

    public LotoFacilGUI() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 800);
        setLocationRelativeTo(null);

        organizarLayout();
    }

    public void organizarLayout() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(new Color(10, 9, 8));
        panel.setBorder(new EmptyBorder(30, 0, 0, 0));

        add(panel, BorderLayout.CENTER);

        Text text = new Text();
        Award award = new Award();
        Aposta0a100 aposta0a100 = new Aposta0a100(award);
        ApostaAaZ apostaAaZ = new ApostaAaZ(award);
        ApostaParOuImpar apostaParOuImpar = new ApostaParOuImpar(award);

        BotaoTipoAposta botaoTipoAposta = new BotaoTipoAposta(panel, award, aposta0a100, apostaAaZ, apostaParOuImpar);

        panel.add(text);
        panel.add(botaoTipoAposta);

        panel.add(award);

        // Atualizar layout
        revalidate();
        repaint();
    }

    // método main que chama o construtor e inicia a aplicação
    public static void main(String[] args) {
        new LotoFacilGUI();
    }
}
