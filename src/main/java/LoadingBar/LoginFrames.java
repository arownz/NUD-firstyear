package LoadingBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrames extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passLabel = new JLabel("PASSWORD");
    JTextField userTF = new JTextField();
    JPasswordField passTF = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showpass = new JCheckBox("Show Password");
    LoginFrames() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }
    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passLabel.setBounds(50, 220, 100, 30);
        userTF.setBounds(150, 150, 150, 30);
        passTF.setBounds(150, 220, 150, 30);
        showpass.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
    }
    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passLabel);
        container.add(userTF);
        container.add(passTF);
        container.add(showpass);
        container.add(loginButton);
        container.add(resetButton);
    }
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showpass.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userT;
            String pwdT;
            userT = userTF.getText();
            pwdT = passTF.getText();
            if (userT.equalsIgnoreCase("imareal") && pwdT.equalsIgnoreCase("words")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or pass");
            }
        }
        if (e.getSource() == resetButton) {
            userTF.setText("");
            passTF.setText("");
        }
        if (e.getSource() == showpass) {
            if (showpass.isSelected()) {
                passTF.setEchoChar((char) 0);
            } else {
                passTF.setEchoChar('*');
            }
        }
    }
}