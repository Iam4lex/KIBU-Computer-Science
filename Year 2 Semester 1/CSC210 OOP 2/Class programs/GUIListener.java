import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIListener implements ActionListener{

	public void actionPerformed(ActionEvent e)
	{
		String buttonString=e.getActionCommand();
		if(buttonString.equals("First Java Button"))
		{
			System.out.print("First Button already Hit\nBye!!");
			System.exit(0);
		}
			else if(buttonString.equals("Second Java Button"))
			{
				System.out.print("Second Button already Hit\nBye!!");
				System.exit(0);
			}
		System.out.print(buttonString);
			
	}    
    
}