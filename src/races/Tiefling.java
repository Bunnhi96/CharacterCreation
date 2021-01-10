package races;

public class Tiefling extends BaseRace{
	private String race_name = "Tiefling";
	private String language = "Gemeinsprache und Infernalisch";
	public Tiefling() {
		setRaceName(race_name);
		setLanguage(language);
		setCharisma(2);
		setSpecificQuestion("Aufgrund des Paktes mit dem Teufel lebst du: ");
	}
}
