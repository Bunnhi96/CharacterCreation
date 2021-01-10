package races;

public class Elf extends BaseRace{
	private String race_name = "Elf";
	private String language = "Gemeinsprache, Elfisch und eine Sprache deiner Wahl";
	
	public Elf () {
		setRaceName(race_name);
		setLanguage(language);
		setDexterity(2);
		setSpecificQuestion("Unterart: ");
	}

}
