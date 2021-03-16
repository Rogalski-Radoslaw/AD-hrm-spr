import javax.swing.*;
import java.awt.*;

public class InputBox extends JPanel {
    private JTextField txtSubject, txtHoursLeft, txtTopic, txtHoursGiven;
    private JButton btnSubmit;

    public InputBox() {
        // upper panel
        JLabel lblSubject = new JLabel("Przedmiot:");
        txtSubject = new JTextField("systemy cms");
        JLabel lblHoursLeft = new JLabel("Pozostało godzin:");
        txtHoursLeft = new JTextField("30");
        JPanel pnlUpper = new JPanel();
        pnlUpper.add(lblSubject);
        pnlUpper.add(txtSubject);
        pnlUpper.add(lblHoursLeft);
        pnlUpper.add(txtHoursLeft);

        // lower panel
        JLabel lblTopic = new JLabel("Temat:");
        txtTopic = new JTextField(8);
        JLabel lblHoursGiven = new JLabel("Liczba godzin:");
        txtHoursGiven = new JTextField(3);
        btnSubmit = new JButton("+");
        JPanel pnlLower = new JPanel();
        pnlLower.add(lblTopic);
        pnlLower.add(txtTopic);
        pnlLower.add(lblHoursGiven);
        pnlLower.add(txtHoursGiven);
        pnlLower.add(btnSubmit);

        this.setLayout(new BorderLayout());
        this.add(pnlUpper, BorderLayout.PAGE_START);
        this.add(pnlLower, BorderLayout.PAGE_END);
    }

    public ControlsSet getControlsSet() {
        return new ControlsSet(txtSubject, txtHoursLeft, txtTopic, txtHoursGiven, btnSubmit);
    }
}
