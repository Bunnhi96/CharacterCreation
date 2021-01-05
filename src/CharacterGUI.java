import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Random;

import javax.swing.*;

public class CharacterGUI {
	public JFrame frame = new JFrame("Automatische Charactergenerierung");
	public static JPanel panel = new JPanel();
	public JTextArea txt = new JTextArea();
	public Random rndm = new Random();
	

	public void setGUI() {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        panel.setLayout(new GridLayout(0,1));
        
        //BoxLayout  boxLayout  = new BoxLayout(panel, BoxLayout.X_AXIS);
        //panel.setLayout(boxLayout);        
		
        panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //plain style constant
        txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //above, left, under, right
        txt.setMargin( new Insets(15,15,15,15) );
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        //disable typing
        txt.setEditable(false);

	}
	
	
}
