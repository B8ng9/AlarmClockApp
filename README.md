# Alarm Clock App

An intuitive Java-based alarm clock application that allows users to set, manage, snooze, and dismiss alarms. Built with a focus on user-friendly design and simple, effective alarm management.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **Home Screen**: Displays the current time and date with an option to set new alarms.
- **Alarm Setting**: Users can set the time, select an alarm tone, and configure new alarms.
- **Alarm Management**: View a list of all active alarms with an on/off toggle.
- **Snooze and Dismiss**: Options to snooze or dismiss alarms when they ring.
- **User Interface**: A clean, responsive, and easy-to-navigate interface.

## Installation

To run the Alarm Clock App locally, follow these steps:

1. **Clone the Repository**: Clone the project to your local machine using the command:
   ```bash
   git clone https://github.com/your-username/AlarmClockApp.git
   ```

2. **Navigate to the Directory**: Move to the project directory.
   ```bash
   cd AlarmClockApp
   ```

3. **Compile the Project**: Compile the Java source files using the command:
   ```bash
   javac src/*.java
   ```

4. **Run the Application**: Run the main class to start the application.
   ```bash
   java -cp src Main
   ```

### Prerequisites

- **Java JDK 8 or higher**: Make sure Java is installed and configured in your environment. You can check your Java version by running:
  ```bash
  java -version
  ```

---

## Usage

1. **Starting the App**:
   - Run the application as described in the installation steps.
   - The home screen will display the current time and date, with options to set alarms.

2. **Setting an Alarm**:
   - Click on "Set New Alarm."
   - Choose the alarm time and tone from the **Alarm Setting** panel.
   - Save the alarm, which will appear in the **Alarm Management** list.

3. **Managing Alarms**:
   - Use the toggle button next to each alarm in **Alarm Management** to enable or disable it.
   - The alarm list shows all saved alarms.

4. **Snooze and Dismiss**:
   - When an alarm rings, you can snooze it to ring again after a delay or dismiss it to turn it off entirely.

---

## Project Structure

The project is organized as follows:

```
AlarmClockApp/
├── src/
│   ├── Main.java              # Main entry point of the application
│   ├── HomeScreen.java        # Displays current time and date
│   ├── AlarmSetting.java      # Allows users to set the alarm time and tone
│   ├── AlarmManagement.java   # Manages a list of alarms with toggles
│   ├── SnoozeDismissHandler.java  # Handles snooze and dismiss actions
│   └── Alarm.java             # Defines alarm properties and behavior
└── resources/
    └── alarm_tone.mp3         # Default alarm tone (placeholder)
```

---

## Contributing

Contributions are welcome! If you have ideas for improvements, new features, or bug fixes, please feel free to open an issue or submit a pull request.

### Steps to Contribute

1. **Fork the repository** and create your branch from `main`.
2. **Clone** your fork to your local machine.
3. **Create a branch** for your feature or bug fix.
4. **Commit** your changes, and **push** your branch.
5. Submit a **pull request** describing your changes.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

---
