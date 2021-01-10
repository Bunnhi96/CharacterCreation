package races;

public class Halfling extends BaseRace{
	private String race_name = "Halbling";
	private String language = "Gemeinsprache und Halblingisch";
	public Halfling() {
		setRaceName(race_name);
		setLanguage(language);
		setDexterity(2);
		setSpecificQuestion("Unterart: ");
	}

}
