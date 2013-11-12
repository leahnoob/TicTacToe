import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Action implements ActionListener {

	private Gui gui;
	private JTextField textField;
	private int numberOfCells;
	
	public Action(Gui gui) {
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand() == "Ok")
        {
	        textField = gui.getDimensions();
	        numberOfCells = Integer.parseInt(textField.getText());
	        
	        if(numberOfCells > 3 && numberOfCells <= 20)
	        {
	        	gui.playerMode();
	        	
	        }
	        
	        	
        }
	}

}
