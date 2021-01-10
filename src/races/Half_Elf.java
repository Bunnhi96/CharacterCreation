package races;

public class Half_Elf extends BaseRace{
	private String race_name = "Halbelf";
	private String language = "Gemeinsprache und Elfisch";
	public Half_Elf() {
		setRaceName(race_name);
		setLanguage(language);
		setCharisma(2);
		setSpecificQuestion("Du wächst auf unter: ");
	}

}
