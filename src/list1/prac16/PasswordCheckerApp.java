package list1.prac16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PasswordCheckerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Проверка пароля");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        JTextField emailField = new JTextField("anton18@mail.ru", 20);
        JTextField nameField = new JTextField("Антон", 20);
        JPasswordField passwordField = new JPasswordField("12345678", 20);
        JLabel emailLabel = new JLabel("Почта:");
        JLabel nameLabel = new JLabel("Имя:");
        JLabel passwordLabel = new JLabel("Пароль:");
        JButton checkButton = new JButton("Проверить");
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(checkButton);
        contentPane.add(inputPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String name = nameField.getText();
                char[] inputPassword = passwordField.getPassword();
                String password = new String(inputPassword);
                boolean isValid = true;
                if (!email.equals("anton18@mail.ru")) {
                    emailField.setForeground(Color.RED);
                    isValid = false;
                } else {
                    emailField.setForeground(Color.BLACK);
                }
                if (!name.equals("Антон")) {
                    nameField.setForeground(Color.RED);
                    isValid = false;
                } else {
                    nameField.setForeground(Color.BLACK);
                }
                if (!password.equals("12345678")) {
                    passwordField.setForeground(Color.RED);
                    isValid = false;
                } else {
                    passwordField.setForeground(Color.BLACK);
                }
                if (isValid) {
                    JOptionPane.showMessageDialog(frame, "Данные верны.");
                }
            }
        });
        frame.setVisible(true);
    }
}
