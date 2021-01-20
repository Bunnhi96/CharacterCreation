import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Random;
import javax.swing.*;

//class for user interface
public class CharacterGUI {
	
	public JFrame frame = new JFrame("Automatische Charactergenerierung für Dungeons & Dragons");
	
	//two panels and one big panel
	//panelA for TextArea
	//panelB for buttons
	public static JPanel panelA = new JPanel();
	public static JPanel panelB = new JPanel();
	public static JPanel bigPanel = new JPanel();
	
	
	//text area for text
	public JTextArea txt = new JTextArea();
	
	//scrollbar
	//public JScrollPane scroll = new JScrollPane(txt); 
	
	//mouse coursor for program
	public Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	

	public void setGUI() {

		// default settings for the whole frame
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setCursor(cursor);

        
//        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
//        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
//        frame.getContentPane().add(scroll);  
     
        panelA.setLayout(new GridLayout(0,1));
        panelA.setBackground(Color.WHITE);
		//panelA.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        panelB.setBackground(Color.WHITE);
        //panelB.setLayout(new GridLayout(0,3,10,10));
		panelB.setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
        
        bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.Y_AXIS));
        
        //plain style constant
        txt.setFont(new Font("Rockwell", Font.PLAIN, 24));
        //txt.setFont(new Font("Tahoma", Font.PLAIN, 24));
        //above, left, under, right
        txt.setMargin( new Insets(15,15,15,15) );
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        //disable typing
        txt.setEditable(false);
	}	
}
