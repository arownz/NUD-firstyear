package LoadingBar;

import javax.swing.*;
import java.awt.*;

public class Tubig extends JFrame{
    JProgressBar jb;
    JLabel lblLoading=new JLabel("Loading...");
    int i=0;
    Tubig (){
    jb = new JProgressBar(0, 500);
         jb.setBounds(40, 40, 160, 30);
         lblLoading.setBounds(40, 20, 100, 20);
         jb.setValue(0);
         jb.setStringPainted(true);
         jb.setBackground(Color.GREEN);
         add(jb);
         add(lblLoading);
         setSize(250, 200);
         setLayout(null);
    }
public void iterate(){
    while(i <= 500){
        jb.setValue(i);
        i = i + 20;
        try {Thread.sleep(150);
        }
        catch(Exception e){
        }
    }
} public static void main(String[]args){
    Tubig load = new Tubig();
    load.setVisible(true);
    load.iterate();
    load.dispose();
    LoginFrames frame = new LoginFrames();
    frame.setTitle("Login Form");
    frame.setVisible(true);
    frame.setBounds(10, 10, 370, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}