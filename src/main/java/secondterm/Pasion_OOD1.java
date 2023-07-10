package secondterm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pasion_OOD1 extends JFrame {

    private JLabel deciL, binaL, hexiL;
    private JTextField deciF, binaF, hexiF;
    private JButton calcuB, exitB;
    private CalButtonhandler cbhandler;
    private ExitHandler ebhandler;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public Pasion_OOD1() {
        deciL = new JLabel("Decimal: ", SwingConstants.RIGHT);
        binaL = new JLabel("Binary :", SwingConstants.RIGHT);
        hexiL = new JLabel("Hexadecimal :", SwingConstants.RIGHT);
        deciF = new JTextField(5);
        binaF = new JTextField(5);
        binaF.setEditable(false);
        hexiF = new JTextField(5);
        hexiF.setEditable(false);
        calcuB = new JButton("Calculate");
        cbhandler = new CalButtonhandler();
        calcuB.addActionListener(cbhandler);
        exitB = new JButton("Exit");
        ebhandler = new ExitHandler();
        exitB.addActionListener(ebhandler);
        setTitle("Decimal to Binary & Hexadecimal");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));
        pane.add(deciL);
        pane.add(deciF);
        pane.add(binaL);
        pane.add(binaF);
        pane.add(hexiL);
        pane.add(hexiF);
        pane.add(calcuB);
        pane.add(exitB);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalButtonhandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(deciF.getText());
            String binaries;
            String hexadecimal;
            binaries = Integer.toBinaryString(input);
            hexadecimal = Integer.toHexString(input);
            binaF.setText("" + binaries);
            hexiF.setText("" + hexadecimal);
        }
    }

    private class ExitHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Pasion_OOD1 wAveObject = new Pasion_OOD1();
    }
}
