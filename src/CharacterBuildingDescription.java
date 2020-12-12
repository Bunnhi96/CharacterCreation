import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;


public class CharacterBuildingDescription implements CharacterGUI{
	private static JButton startButton;
	private static JButton randomButton;
	
	
	
	private static void readFromFile() {
		 String newline = "\n";
		 try{
	        	BufferedReader rd = new BufferedReader(new FileReader("program_description.txt"));
	        
	        	while (true) {
			        String line = rd.readLine();
			        if (line == null) break;
			        txt.append(line + newline);
	        	}
	        	rd.close();
	        } catch(Exception e){
				e.printStackTrace();
			}
		 panel.add(txt);
	}
	
	private static void createButton() {
		
		startButton = new JButton("Starte jetzt dein Abenteuer");
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		randomButton = new JButton("Überspringe das Abenteuer und erstelle einen Zufallscharakter");
		randomButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(startButton);
		panel.add(randomButton);
		startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (e.getSource() == startButton) {
            		panel.removeAll();
            		panel.repaint();
            		CharacterQuestions.getFirstQuestion();
            	}
                
            }
        });
		
	}
	
	public static void getDescriptionText() {
		
		CharacterGUI.setGUI();
       
        readFromFile();
        createButton();
        
        frame.setContentPane(panel);
        frame.setVisible(true);
	}
}
