package races;

public class Dwarf extends BaseRace{
	private String race_name = "Zwerg";
	private String language = "Gemeinsprache und Zwergisch";
	public Dwarf() {
		setRaceName(race_name);
		setLanguage(language);
		setConstitution(2);
		setSpecificQuestion("Unterart: ");
		System.out.println("Zwerg Konstruk");
	}

}
