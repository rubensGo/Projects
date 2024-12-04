import javax.swing.*;
import java.util.Locale;
import java.awt.DisplayMode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste {
    public static void main(String[] args) {
        // resolução do monitor
        DisplayMode dm = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
        Locale linguagem = Locale.getDefault();
        // Criar o JFrame (janela principal)
        JFrame frame = new JFrame("Mostra Resoluçao e Linguagem");
        frame.setSize(300, 200); // Definir tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar um botão
        JButton botao = new JButton("Clique aqui");

        // Adicionar um evento ao botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, dm.getWidth()+"x"+ dm.getHeight());
            }
        });
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, linguagem.getDisplayName());
            }
        });
        // Adicionar o botão ao JFrame
        frame.getContentPane().add(botao); // Adicionar o botão ao centro por padrão

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
