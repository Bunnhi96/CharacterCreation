import java.awt.Font;
import java.awt.Insets;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.*;


public class Character {
	public static String race_name ="";
	public static String class_name ="";
	

	
	public static void setRaceName () {
		System.out.println(race_name);
	}
	
	public static void setClassName () {
		System.out.println(class_name);
	}
	
	
	public void attributes() {
		int charisma = 0;
		int constitution = 0;
		int strength = 0;
		int intelligence = 0;
		int dexterity = 0;
		int wisdom = 0;
		
	}
	
	
	
	public static void setup(){
		
        CharacterBuildingDescription.getDescriptionText();
        
	}
	
	
	
	public static void main(String[] args) {
		setup();
		setRaceName();
		setClassName();
		
	 }

}
