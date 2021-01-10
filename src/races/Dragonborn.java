package races;

public class Dragonborn extends BaseRace {
	private String race_name = "Drachenblütiger";
	private String language = "Gemeinsprache und Drakonisch";
	
	public Dragonborn() {
		setRaceName(race_name);
		setLanguage(language);
		setStrength(2);
		setSpecificQuestion("Enstammung der Drachenlinie: ");
	}

}
