import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;


public class CharacterBuildingDescription extends CharacterGUI implements ActionListener{
	private JButton startButton;
	private JButton randomButton;
	
	CharacterBuildingDescription(){
		startButton = new JButton("Starte jetzt dein Abenteuer");
		//startButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		randomButton = new JButton("Überspringe das Abenteuer und erstelle einen Zufallscharakter");
		//randomButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	
	public void getDescriptionText() {
		
		setGUI();
        readFromFile("program_description.txt");
        addButton();
        addButtonActionListeners();
        frame.setContentPane(panel);
        frame.setVisible(true);
	}
	
	private void readFromFile(String doc) {
		 String newline = "\n";
		 String doc_text = "";
		 try{
	        	BufferedReader rd = new BufferedReader(new FileReader(doc));
	        
	        	while (true) {
			        String line = rd.readLine();
			        if (line == null) break;
			        doc_text = doc_text + line + newline;
	        	}
	        	rd.close();
	        } catch(Exception e){
				e.printStackTrace();
			}
		 txt.setText(doc_text);
		 panel.add(txt);
	}
	
	private void addButton() {
		
		panel.add(startButton);
		panel.add(randomButton);
		
		startButton.addActionListener(this);
		randomButton.addActionListener(this);
				
	}
	
	public void addButtonActionListeners() {
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);		
	}
	
	
	
	public void getFirstQuestion() {
		readFromFile("first_question.txt");
		setFirstButtonAnswers();
		
		frame.setContentPane(panel);
        frame.setVisible(true);
		
	}
	
	public void setFirstButtonAnswers(){
		
		
		one.setText("körperliche Kraft");
		two.setText("analytische Fähigkeiten");
		three.setText("ausgeprägte Reflexe");
		four.setText("gute Auffassunggabe");
		five.setText("hohe Widerstandskraft");
		six.setText("starkes Selbstbewusstsein");
		//seven.setText("Von allem etwas");
		
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		//panel.add(seven);
			
	}
	
	public void actionPerformed(ActionEvent e) {
      	if (e.getSource() == startButton) {
      		clearPanel();
      		getFirstQuestion();
      	}
      	
    	if (e.getSource() == randomButton) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == one) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == two) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == three) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == four) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == five) {
      		clearPanel();
      		//TODO
      	}
    	
    	if (e.getSource() == six) {
      		clearPanel();
      		//TODO
      	}
    	
//    	if (e.getSource() == seven) {
//      		clearPanel();
//      		seven.removeActionListener(this);
//      	}
      	
      	
          
      }
	
	public void clearPanel() {
		panel.removeAll();
  		panel.repaint();
  	
	}
	
	
}
