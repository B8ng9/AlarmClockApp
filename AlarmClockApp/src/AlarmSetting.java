
import javax.swing.*;
import java.awt.*;

public class AlarmSetting extends JPanel {
    private JSpinner timeSpinner;
    private JComboBox<String> toneSelector;

    public AlarmSetting() {
        setLayout(new GridLayout(2, 1));
        
        timeSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
        timeSpinner.setEditor(timeEditor);
        
        toneSelector = new JComboBox<>(new String[] {"Beep", "Melody", "Buzz"});
        
        add(new JLabel("Set Alarm Time:"));
        add(timeSpinner);
        add(new JLabel("Select Tone:"));
        add(toneSelector);
    }

    public String getSelectedTime() {
        return timeSpinner.getValue().toString();
    }

    public String getSelectedTone() {
        return toneSelector.getSelectedItem().toString();
    }
}
