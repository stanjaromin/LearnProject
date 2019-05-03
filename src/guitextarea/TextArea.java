package guitextarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.SwingConsole.*;

public class TextArea extends JFrame {
    private JButton
            b = new JButton("Dodaj dane"), //mamy dwa obiekty b i c ktore są przyciskami
            c = new JButton("Wyczyść");
    private JTextArea t = new JTextArea(20, 40); //tworzy obiekt ktrory jest obszarem w oknie
    private Map<String,String> m = new HashMap<String,String>();

    public TextArea() {
        m.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() { //nadsłuchuje czy zostal nacisniety przycisk b czyli "Dodaj dane"
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry me : m.entrySet())
                    t.append(me.getKey() + ":" + me.getValue() + "\n");
            }
        });
        c.addActionListener(new ActionListener() { //nasluchuje czy zostal nacisniety przycisk c czyli "Wyczysc"
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        //add(t);
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        run(new TextArea(), 500, 450);
    }
}
