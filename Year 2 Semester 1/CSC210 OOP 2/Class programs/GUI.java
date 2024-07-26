import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class GUI extends Jframe{
        
 
    public GUI() {
    	  super();
    	JPanel panel1 = new JPanel();
    	JButton btn = new JButton("First Java Button");
    	GUIListener listener = new GUIListener();
    	btn.addActionListener(listener);
    	
    	
    	JButton btn1 = new JButton("Second Java Button");
    	btn1.addActionListener(listener);
    	
    	panel1.add(btn);
    	panel1.add(btn1);
    	/*
        JFrame frame = new JFrame("First Java GUI");
        frame.setSize(900,600);
        frame.setTitle("Second Java GUI");
        frame.add(panel1);
        frame.setVisible(true);
  */
    setSize(900,700);
    setTitle("Java GUI");
    add(panel1);
    setVisible(true);
    }
 
    public static void main(String[] args) {
    	
        
        new GUI();
    }
}