package races;

public class Half_Orc extends BaseRace{
	private String race_name = "Halbork";
	private String language = "Gemeinsprache und Orkisch";
	public Half_Orc() {
		setRaceName(race_name);
		setLanguage(language);
		setStrength(2);
		setSpecificQuestion("Du wächst auf unter: ");
	}
	
}
