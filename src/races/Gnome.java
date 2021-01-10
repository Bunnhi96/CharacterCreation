package races;

public class Gnome extends BaseRace{
	private String race_name = "Gnom";
	private String language = "Gemeinsprache und Gnomisch";
	public Gnome() {
		setRaceName(race_name);
		setLanguage(language);
		setIntelligence(2);
		setSpecificQuestion("Unterart: ");
	}
	
}
