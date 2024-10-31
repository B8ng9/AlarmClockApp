
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Alarm Clock App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        HomeScreen homeScreen = new HomeScreen();
        AlarmSetting alarmSetting = new AlarmSetting();
        AlarmManagement alarmManagement = new AlarmManagement();
        SnoozeDismissHandler snoozeDismissHandler = new SnoozeDismissHandler();

        add(homeScreen, BorderLayout.NORTH);
        add(alarmSetting, BorderLayout.CENTER);
        add(alarmManagement, BorderLayout.WEST);
        add(snoozeDismissHandler, BorderLayout.SOUTH);

        homeScreen.updateDateTime();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setVisible(true);
        });
    }
}
