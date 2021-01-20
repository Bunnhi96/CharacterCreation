package races;

public class Dwarf extends BaseRace{
	private String race_name = "Zwerg";
	private String language = "Gemeinsprache und Zwergisch";
	private int constitution = 2;
	private String specificQuestion = "Unterart: ";
	
		public Dwarf() {
		setRaceName(race_name);
		setLanguage(language);
		setConstitution(constitution);
		setSpecificQuestion(specificQuestion);
	}
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getConstitution() {
//		return constitution;
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
