package zadanie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class u_butt1 extends JFrame {

    JButton button;
    int colorKey = 0;
    protected Color[] colors = new Color[]{Color.WHITE, Color.BLACK,
            Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.CYAN, Color.MAGENTA};

    u_butt1() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 300));

        button = new JButton("Button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (colorKey >= colors.length) {
                    colorKey = 0;
                }

                button.setBackground(colors[colorKey]);
                colorKey++;
            }
        });
        add(button);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new u_butt1();
            }
        });
    }
}