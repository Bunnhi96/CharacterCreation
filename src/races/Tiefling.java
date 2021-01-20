package races;

public class Tiefling extends BaseRace{
	private String race_name = "Tiefling";
	private String language = "Gemeinsprache und Infernalisch";
	private int charisma = 2;
	private String specificQuestion = "Aufgrund des Paktes mit dem Teufel lebst du: ";
	
	public Tiefling() {
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
//	public String getLanguage() {
//		return language;
//	}
//
//	public String getSpecificQuestion() {
//		return specificQuestion;
//		
//	}
}
