
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AlarmManagement extends JPanel {
    private DefaultListModel<String> alarmListModel;
    private JList<String> alarmList;

    public AlarmManagement() {
        setLayout(new BorderLayout());
        
        alarmListModel = new DefaultListModel<>();
        alarmList = new JList<>(alarmListModel);
        JScrollPane scrollPane = new JScrollPane(alarmList);
        
        add(new JLabel("Set Alarms:"), BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addAlarm(String alarm) {
        alarmListModel.addElement(alarm);
    }

    public void removeAlarm(String alarm) {
        alarmListModel.removeElement(alarm);
    }
}
