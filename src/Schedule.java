import javax.swing.*;
import java.awt.*;

public class Schedule {
    private Schedule() {
        // top panel
        InputBox pnlTop = new InputBox();

        // middle panel
        JPanel pnlMiddle = new JPanel(new BorderLayout());
        EntriesArea entriesArea = new EntriesArea(pnlTop.getControlsSet());
        pnlMiddle.add(entriesArea, BorderLayout.CENTER);

        // bottom panel
        ActionBar pnlBottom = new ActionBar(entriesArea.getEntries());

        // window
        JFrame win = new JFrame("Harmonogram zajęć");
        win.add(pnlTop, BorderLayout.PAGE_START);
        win.add(pnlMiddle, BorderLayout.CENTER);
        win.add(pnlBottom, BorderLayout.PAGE_END);

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);
    }

    public static void main(String[] args) {
        new Schedule();
    }
}
