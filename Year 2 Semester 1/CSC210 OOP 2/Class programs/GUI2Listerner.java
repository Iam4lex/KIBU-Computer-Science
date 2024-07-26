import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI2Listerner {

		public void actionPerformed(ActionEvent e)
		{
			String buttonString=e.getActionCommand();
			
			if(buttonString.equals("DISPLAY"))
			{
		      	
			}
			else if(buttonString.equals("CLEAR"))
			{
				
			}
			else if(buttonString.equals("EXIT"))
			{
				System.exit(0);
			}

		}
    
    
}