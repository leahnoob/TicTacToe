import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui {

	private JFrame frame;
	private Action action;
	private int numberOfCells;
	private static JTextField dimensions = new JTextField();
	private JFrame boardFrame;
	private JPanel boardPanel, buttonPanel;
	private JButton cell;
	
	public Gui(){

		dimensionsGui();
		
        boardFrame = new JFrame("Tic-Tac-Toe");

        boardPanel = new JPanel();
        buttonPanel = new JPanel();

        // defines the names of the buttons
        newGameButton = new JButton("New");
        quitButton = new JButton("Quit");

        // instantiates 10 buttons within the array b[]
        b = new JButton[10];
        for (int i = 0; i < 10; i++) {
            // these buttons will be marked as X or O during play
            // hence, their names are left blank using ""
            b[i] = new JButton("");
        }

        // by default, X is first to play
        isXturn = true;
        isGameFinished = false;
	}
	
	public void dimensionsGui(){
		frame = new JFrame("Tic-Tac-Toe");
    	JPanel panel = new JPanel();
    	JButton ok= new JButton("Ok");
    	JTextField dimensions = new JTextField("");
    	JLabel question = new JLabel("Select the board dimentions");
    	
    	frame.setLayout(new BorderLayout());
        frame.add(ok, BorderLayout.SOUTH);
        frame.add(dimensions, BorderLayout.CENTER);
        frame.add(question, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(3, 1));
        
        frame.setSize(280, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        action = new Action(this);
        ok.addActionListener(action);
	        
	}
	
	public JTextField getDimensions(){
		return dimensions;
	}

	public void playerMode() {
		
		
	}
}
