package races;

public class Elf extends BaseRace{
	private String race_name = "Elf";
	private String language = "Gemeinsprache, Elfisch und eine Sprache deiner Wahl";
	private int dexterity = 1 ;
	private String specificQuestion = "Unterart: ";
	
	
	public Elf () {
		setRaceName(race_name);
		setLanguage(language);
		setDexterity(dexterity);
		setSpecificQuestion(specificQuestion);
	}
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getDexterity() {
//		return dexterity;
//	}
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
