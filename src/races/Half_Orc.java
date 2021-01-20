package races;

public class Half_Orc extends BaseRace{
	private String race_name = "Halbork";
	private String language = "Gemeinsprache und Orkisch";
	private int strength = 2;
	private String specificQuestion = "Du wächst auf unter: ";
	
	public Half_Orc() {
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
