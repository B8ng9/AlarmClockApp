import java.time.LocalTime;

public class Alarm {
    private LocalTime time;
    private String tone;
    private boolean isEnabled;
    private boolean isSnoozed;
    private static final int SNOOZE_MINUTES = 5; // 5-minute snooze

    public Alarm(LocalTime time, String tone) {
        this.time = time;
        this.tone = tone;
        this.isEnabled = true;
        this.isSnoozed = false;
    }

    // Getter and Setter for time
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    // Getter and Setter for tone
    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    // Method to check if the alarm is enabled
    public boolean isEnabled() {
        return isEnabled;
    }

    public void toggleEnabled() {
        this.isEnabled = !this.isEnabled;
    }

    // Method to snooze the alarm
    public void snooze() {
        this.isSnoozed = true;
        this.time = this.time.plusMinutes(SNOOZE_MINUTES);
    }

    // Method to dismiss the alarm
    public void dismiss() {
        this.isEnabled = false;
        this.isSnoozed = false;
    }

    // Method to check if it's time for the alarm to ring
    public boolean shouldRing(LocalTime currentTime) {
        return isEnabled && !isSnoozed && currentTime.equals(time);
    }

    @Override
    public String toString() {
        return "Alarm set for " + time + " with tone " + tone + " (Enabled: " + isEnabled + ")";
    }
}

