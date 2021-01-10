package races;

public class Human extends BaseRace{
	private String race_name = "Mensch";
	private String language = "Gemeinsprache und eine Sprache deiner Wahl";
		
	public Human() {
		setRaceName(race_name);
		setLanguage(language);
		setCharisma(1);
		setDexterity(1);
		setConstitution(1);
		setStrength(1);
		setIntelligence(1);
		setWisdom(1);
		setSpecificQuestion("Ethnie: ");
	}

}
