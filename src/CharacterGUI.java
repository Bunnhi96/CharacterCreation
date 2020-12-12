import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Random;

import javax.swing.*;

public interface CharacterGUI {
	public static final JFrame frame = new JFrame("Automatische Charactergenerierung");
	public static final JPanel panel = new JPanel();
	public static final JTextArea txt = new JTextArea();
	public static final JButton one = new JButton();
	public static final JButton two = new JButton();
	public static final JButton three = new JButton();
	public static final JButton four = new JButton();
	public static final JButton five = new JButton();
	public static final JButton six = new JButton();
	public static final JButton seven = new JButton();
	
	public static final Random rndm = new Random();

	public static void setGUI() {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setSize(JFrame.HEIGHT,JFrame.WIDTH);
        frame.setVisible(true);
        frame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        panel.setLayout(new GridLayout(0,1));
                
		panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //plain style constant
        txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //above, left, under, right
        txt.setMargin( new Insets(15,15,15,15) );
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        
        one.setFont(new Font("Tahoma", Font.PLAIN, 20));
        two.setFont(new Font("Tahoma", Font.PLAIN, 20));
        three.setFont(new Font("Tahoma", Font.PLAIN, 20));
        four.setFont(new Font("Tahoma", Font.PLAIN, 20));
        five.setFont(new Font("Tahoma", Font.PLAIN, 20));
        six.setFont(new Font("Tahoma", Font.PLAIN, 20));
        seven.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	
}
