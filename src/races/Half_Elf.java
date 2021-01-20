package races;

public class Half_Elf extends BaseRace{
	private String race_name = "Halbelf";
	private String language = "Gemeinsprache und Elfisch";
	private int charisma = 2;
	private String specificQuestion = "Du wächst auf unter: ";	
	
	public Half_Elf() {
		setRaceName(race_name);
		setLanguage(language);
		setCharisma(charisma);
		setSpecificQuestion(specificQuestion);
	}
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getCharisma() {
//		return charisma;
//	}
//	
//	
//	public String getLanguage() {
//		return language;
//	}
//
//	public String getSpecificQuestion() {
//		return specificQuestion;
//		
//	}

}
