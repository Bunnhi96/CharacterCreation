package races;

public class Halfling extends BaseRace{
	private String race_name = "Halbling";
	private String language = "Gemeinsprache und Halblingisch";
	private int dexterity = 2;
	private String specificQuestion = "Unterart: ";
	
	public Halfling() {
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
