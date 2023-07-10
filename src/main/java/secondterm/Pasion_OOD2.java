package secondterm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pasion_OOD2 extends JFrame {

    private JLabel adL, dyL, irL, vmL;
    private JTextField adTF, dyTF, irTF, vmTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public Pasion_OOD2() {
        adL = new JLabel("Amount Deposited: ", SwingConstants.RIGHT);
        dyL = new JLabel("Duration in Years: ", SwingConstants.RIGHT);
        irL = new JLabel("Interest Rate: ", SwingConstants.RIGHT);
        vmL = new JLabel("Value on Maturity: ", SwingConstants.RIGHT);
        adTF = new JTextField(5);
        dyTF = new JTextField(5);
        irTF = new JTextField(5);
        vmTF = new JTextField(5);
        vmTF.setEditable(false);
        calculateB = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5, 2));
        pane.add(adL);
        pane.add(adTF);
        pane.add(dyL);
        pane.add(dyTF);
        pane.add(irL);
        pane.add(irTF);
        pane.add(vmL);
        pane.add(vmTF);
        pane.add(calculateB);
        pane.add(exitB);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalculateButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double P = Double.parseDouble(adTF.getText());
            double R = Double.parseDouble(dyTF.getText());
            double T = Double.parseDouble(irTF.getText());
            double maturityAmount = P * Math.pow((1 + R * T / 100), T);
            vmTF.setText(String.valueOf(maturityAmount));
        }
    }

    private class ExitButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Pasion_OOD2 wAveObject = new Pasion_OOD2();
    }
}
