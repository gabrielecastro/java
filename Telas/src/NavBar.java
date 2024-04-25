import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavBar {
    // Método estático para criar o menu e retorná-lo
    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem itemNovoCadastro = new JMenuItem("Novo Cadastro");


        // Adicionando um ouvinte de ação para o item de menu "Novo Cadastro"
        itemNovoCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cadastro.abrirJanela();

            }
        });

        menuCadastro.add(itemNovoCadastro);
        menuBar.add(menuCadastro);

        return menuBar;
    }
}
