import javax.swing.*;

public class CharacterQuestions implements CharacterGUI {
	
	
	public static void getFirstQuestion() {

		txt.setText("Du lebst in einem kleinen Dorf mit deinen zwei j�ngeren Geschwistern und eurem Vater.\r\n" + 
				"Eure Mutter ist vor langer Zeit verschwunden. Deine Geschwister kommen nach deiner Mutter.\r\n" + 
				"Du selbst kommst nach deinem Vater. Er ist: ");
		panel.add(txt);
		setButtonAnswers();
		
		frame.setContentPane(panel);
        frame.setVisible(true);
		
	}
	
	private static void setButtonAnswers(){
		one.setText("St�rke");
		
		panel.add(one);
		
	}
}
