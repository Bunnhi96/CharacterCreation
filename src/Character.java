public class Character extends CharacterGUI {
	Character(){
		setupQuestions();
	}
	public void setupQuestions(){
		CharacterQuestions quest = new CharacterQuestions();
		quest.readFromFile("program_description.txt");
	}
	
	
	
	
	public static void main(String[] args) {
		Character c = new Character();
	 }

}
