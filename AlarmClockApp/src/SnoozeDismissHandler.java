
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnoozeDismissHandler extends JPanel {

    public SnoozeDismissHandler() {
        JButton snoozeButton = new JButton("Snooze");
        JButton dismissButton = new JButton("Dismiss");

        snoozeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Alarm Snoozed");
            }
        });

        dismissButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Alarm Dismissed");
            }
        });

        add(snoozeButton);
        add(dismissButton);
    }
}
