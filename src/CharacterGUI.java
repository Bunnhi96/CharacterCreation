import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Random;

import javax.swing.*;

public class CharacterGUI {
	public JFrame frame = new JFrame("Automatische Charactergenerierung");
	public static JPanel panel = new JPanel();
	public static JPanel panel2 = new JPanel();
	public static JPanel bigPanel = new JPanel();
	public JTextArea txt = new JTextArea();
	public Random rndm = new Random();
	

	public void setGUI() {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        panel.setLayout(new GridLayout(0,4,10,10));
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel2.setLayout(new GridLayout(0,1));
        
        //panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.Y_AXIS));
        
        
        
		
        panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 20));

        panel2.setBackground(Color.WHITE);
		panel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
