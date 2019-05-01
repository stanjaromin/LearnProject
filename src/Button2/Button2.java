package Button2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static net.mindview.util.SwingConsole.run;

public class Button2 extends JFrame {
    private JButton

            b1 = new JButton("Przycisk 1"),
            b2 = new JButton("Przycisk 2");
    private JTextField txt = new JTextField(10);

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            // metoda getsource zwraca obiekt, od ktorego pochodzi zdarzenie i zakladam ze jest typu JButton
            // metoda gettext podaje text umieszczony na przycisku ktory nastepnie zostaje umieszczony w polu tekstowym
            // poprzez zmienno name i zastosowaną następną linijke
            txt.setText(name);
        }
    }

    private ButtonListener bl = new ButtonListener();

    public Button2() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }

    public static void main(String[] args) {
        run(new Button2(), 200, 150);
    }
}//LOL XD
