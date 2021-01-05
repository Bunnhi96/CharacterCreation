import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;

import classes.BaseClass;
import races.BaseRace;


public class Character extends CharacterGUI {
//	public String race_name ="";
//	public String class_name ="";
	public int attr_amount = 6;
	public Random rdn = new Random();
	public int [] attributes = new int [6];
	
	Character(){
		diceAttributes();
		setupQuestions();
	}
	
//
//	public void setRaceName () {
//		System.out.println("Rasse: " + race_name);
//	}
//	
//	public void setClassName () {
//		System.out.println("Klasse: " + class_name);
//	}
	
	
	public void diceAttributes() {
		for (int i = 0; i < attributes.length ; i++) {
			int value = 0;
			int [] dices = new int [4];
			for(int j = 0; j < dices.length; j++) {
				dices[j] = rdn.nextInt(6) + 1;
				System.out.println ("dices j" + dices[j]);
				value += dices[j];
			}
			System.out.println ("VALUE" + value);
			
			attributes[i] = value - findMinimum(dices);
			 
		
		}
		sortArray();
		
	}
	
	public int findMinimum(int [] dices) {
		int min = dices[0];		 
		for (int i = 0; i < dices.length; i++) {
			if (min > dices[i]) {
				min = dices[i];
			}
			
		}
		System.out.println ("MIN" + min);
		
		return min;
	}
	
	public void sortArray() {
		Arrays.sort(attributes);
	}
	
	public void setupQuestions(){
		CharacterQuestions quest = new CharacterQuestions();
		quest.readFromFile("program_description.txt");
	}
	
	
	
	public static void main(String[] args) {
		Character c = new Character();
//		System.out.println("Volk:");
//		System.out.println("Klasse:");
//		System.out.println("Sprachen:");
//		System.out.println("Persönlichkeitsmerkmal:");
//		System.out.println("Ideal:");
//		System.out.println("Makel:");
//		System.out.println("Bindung:");
//		System.out.println("Attributswerte:");
//		System.out.println("Stärke:");
//		System.out.println("Geschicklichkeit:");
//		System.out.println("Konstitution:");
//		System.out.println("Intelligenz:");
//		System.out.println("Weisheit:");
//		System.out.println("Charisma:");
		
//		JButton restart = new JButton ("Neustart");
//		restart.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel.add(restart);
//		
//		restart.addActionListener( new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if(ae.getSource() == restart) {
//					Character c = new Character();
//				}
//			}
//			
//		});
	 }

}
