package races;

public class Human extends BaseRace{
	private String race_name = "Mensch";
	private String language = "Gemeinsprache und eine Sprache deiner Wahl";
	private int charisma = 1;
	private int dexterity = 1;
	private int constitution = 1;
	private int wisdom = 1;
	private int intelligence = 1;
	private int strength = 1;
	private String specificQuestion = "Ethnie: ";

	public Human() {
		setRaceName(race_name);
		setLanguage(language);
		setCharisma(charisma);
		setDexterity(dexterity);
		setConstitution(constitution);
		setStrength(strength);
		setIntelligence(intelligence);
		setWisdom(wisdom);
		setSpecificQuestion(specificQuestion);
	}
	
	
//	public String getRaceName() {
//		return race_name;
//	}
//
//	public int getCharisma() {
//		return charisma;
//	}
//	
//	public int getStrength() {
//		return strength;
//	}
//	
//	public int getDexterity() {
//		return dexterity;		
//	}
//	public int getIntelligence() {
//		return intelligence;		
//	}
//	public int getConstitution() {
//		return constitution;		
//	}
//	public int getWisdom() {
//		
//		return wisdom;
//	}
//	
//	
//	public String getLanguage() {
//		return language;
//	}
//
//	public String getSpecificQuestion() {
//		return specificQuestion;
//		
//	}
	

}
