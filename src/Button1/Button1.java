package Button1;

import javax.swing.*;
import java.awt.*;

import static net.mindview.util.SwingConsole.*;

public class Button1 extends JFrame {
    private JButton
            b1 = new JButton("Przycisk 1"),
            b2 = new JButton("Przycisk 2");

    public Button1() {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);

    }

    public static void main(String[] args) {
        run(new Button1(), 200, 200);
    }

}//LOL XD
