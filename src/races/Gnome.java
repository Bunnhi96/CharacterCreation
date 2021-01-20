package races;

public class Gnome extends BaseRace{
	private String race_name = "Gnom";
	private String language = "Gemeinsprache und Gnomisch";
	private int intelligence = 2;
	private String specificQuestion ="Unterart: ";
	
	public Gnome() {
		setRaceName(race_name);
		setLanguage(language);
		setIntelligence(intelligence);
		setSpecificQuestion(specificQuestion);
	}
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getIntelligence() {
//		return intelligence;		
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
