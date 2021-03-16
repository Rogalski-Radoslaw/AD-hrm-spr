import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntriesArea extends JScrollPane {
    private DefaultListModel entries;

    public EntriesArea(ControlsSet cs) {
        entries = new DefaultListModel();
        cs.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int hoursLeft = Integer.parseInt(cs.txtHoursLeft.getText());
                    int hoursGiven = Integer.parseInt(cs.txtHoursGiven.getText());

                    if (hoursLeft > 0 && hoursGiven > 0) {
                        if ((hoursLeft - hoursGiven) >= 0) {
                            if (cs.txtSubject.isEnabled())
                                cs.txtSubject.setEnabled(false);

                            if (cs.txtHoursLeft.isEnabled())
                                cs.txtHoursLeft.setEnabled(false);

                            entries.addElement(cs.txtTopic.getText() + " :: " + hoursGiven + "h");
                            cs.txtHoursLeft.setText(String.valueOf(hoursLeft - hoursGiven));
                        } else {
                            System.out.println("brak godzin do przydzialu");
                        }
                    } else {
                        System.out.println("liczba godzin nie moze byc ujemna");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("niepoprawny format danych");
                }
            }
        });
        JList lstEntries = new JList(entries);
        lstEntries.setVisibleRowCount(6);
        this.setViewportView(lstEntries);
    }

    public DefaultListModel getEntries() {
        return entries;
    }
}
