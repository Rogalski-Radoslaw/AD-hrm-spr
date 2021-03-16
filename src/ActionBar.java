import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBar extends JPanel {
    private Lesson[] lessons = new Lesson[0];

    public ActionBar(DefaultListModel entries) {
        JButton btnImport = new JButton("Import");
        btnImport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Lesson lesson : lessons)
                    entries.addElement(lesson.getTopic() + " :: " + lesson.getHours());
                lessons = new Lesson[0];
            }
        });
        JButton btnExport = new JButton("Export");
        btnExport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lessons = new Lesson[entries.getSize()];
                for (int i = 0; i < lessons.length; i++) {
                    String topic = entries.get(i).toString().split(" :: ")[0];
                    String hours = entries.get(i).toString().split(" :: ")[1];
                    lessons[i] = new Lesson(topic, hours);
                }
                entries.clear();
            }
        });

        this.add(btnImport);
        this.add(btnExport);
    }
}
