/**
 * @author Nhi Tran
 *This is a program to generate an automatic character for Dunegons & Dragons.
 *The user must answer questions and based on his result a character will be created.
 */

public class Character{
	Character(){
		setupQuestions();
	}	
	//reads description file
	public void setupQuestions(){
		CharacterQuestions quest = new CharacterQuestions();
		quest.readFromFile("program_description.txt");
	}	
	//starts here and creates a new character
	public static void main(String[] args) {
		Character c = new Character();
	 }
}

