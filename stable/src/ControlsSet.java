import javax.swing.*;

public class ControlsSet {
    public JTextField txtSubject, txtHoursLeft, txtTopic, txtHoursGiven;
    public JButton btnSubmit;

    public ControlsSet(JTextField txtSubject, JTextField txtHoursLeft, JTextField txtTopic, JTextField txtHoursGiven, JButton btnSubmit) {
        this.txtSubject = txtSubject;
        this.txtHoursLeft = txtHoursLeft;
        this.txtTopic = txtTopic;
        this.txtHoursGiven = txtHoursGiven;
        this.btnSubmit = btnSubmit;
    }
}
