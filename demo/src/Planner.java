import javax.swing.*;
import java.awt.*;

public class Planner {
    JFrame win = new JFrame();

    public Planner() {
        win.setTitle("Harmonogram zajęć");
        win.setLayout(new BorderLayout());
        win.add(new ListaTematow(), BorderLayout.CENTER);

        win.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("app.png")));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);
    }

    public static void main(String[] args) {
        new Planner();
    }
}
