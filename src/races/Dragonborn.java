package races;

public class Dragonborn extends BaseRace {
	private String race_name = "Drachenbl�tiger";
	private String language = "Gemeinsprache und Drakonisch";
	
	public Dragonborn() {
		setRaceName(race_name);
		setLanguage(language);
		setStrength(2);
		setSpecificQuestion("Enstammung der Drachenlinie: ");
	}

}
