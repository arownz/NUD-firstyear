package LoadingBar;

import java.awt.Color;
import javax.swing.JFrame;

public class tut {

    public static void main(String[] args) {
        LoginFrames frame = new LoginFrames() {};
            frame.setTitle("Login while loading");
            frame.setVisible(true);
            frame.setBounds(10,10,370,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.setBackground(Color.BLACK);   
    }
}