import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Random;

import javax.swing.*;

public class CharacterGUI {
	public JFrame frame = new JFrame("Automatische Charactergenerierung");
	public JPanel panel = new JPanel();
	public JTextArea txt = new JTextArea();

	public JButton one = new JButton();
	public JButton two = new JButton();
	public JButton three = new JButton();
	public JButton four = new JButton();
	public JButton five = new JButton();
	public JButton six = new JButton();
	public JButton seven = new JButton();
	
	//public String [] numbers =  {"one","two","three","four","five","six","seven"};
	
	public Random rndm = new Random();

	public void setGUI() {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setSize(JFrame.HEIGHT,JFrame.WIDTH);
        frame.setVisible(true);
        frame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        panel.setLayout(new GridLayout(0,1));
        
        //BoxLayout  boxLayout  = new BoxLayout(panel, BoxLayout.X_AXIS);
        //panel.setLayout(boxLayout);        
		
        panel.setBackground(Color.WHITE);
		//panel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //plain style constant
        //txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //above, left, under, right
        txt.setMargin( new Insets(15,15,15,15) );
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        
//        one.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        two.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        three.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        four.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        five.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        six.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        seven.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
	}
	
	
}
