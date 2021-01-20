package races;

public class Dragonborn extends BaseRace{
	private String race_name = "Drachenblütiger";
	private String language = "Gemeinsprache und Drakonisch";
	private int strength = 2;
	private String specificQuestion = "Enstammung der Drachenlinie: ";
	
	public Dragonborn() {
		setRaceName(race_name);
		setLanguage(language);
		setStrength(strength);
		setSpecificQuestion(specificQuestion);
	}
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getStrength() {
//		return strength;
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
