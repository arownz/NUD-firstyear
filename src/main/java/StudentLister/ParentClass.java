package StudentLister;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParentClass {

    private JFrame frame;
    private int Count;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ParentClass window = new ParentClass();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ParentClass() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnClicked = new JButton("Clicked");
        btnClicked.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Count++;
                System.out.println("Count = "+Count);
                if(Count==1)
                {
                    ChildClass obj=new ChildClass();
                    obj.ChildClassVisibility();
                }
            }
        });
        btnClicked.setBounds(150, 99, 89, 23);
        frame.getContentPane().add(btnClicked);
    }
}