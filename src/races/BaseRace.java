package races;

public class BaseRace{
	//default value
	private String race="";
	private String language="";
	private int charisma = 0;
	private int wisdom = 0;
	private int dexterity = 0;
	private int strength = 0;
	private int intelligence = 0;
	private int constitution = 0;
	private String specific="";
	
	//depending on which race the user choose -> new race
	//9 different options
	public void setRace(String name) {
		switch(name) {
		case "Dragonborn": 
			//depending on which class the user choose -> new class
			Dragonborn dragon = new Dragonborn();
			race = dragon.getRaceName();
			language = dragon.getLanguage();
			strength = dragon.getStrength();
			specific = dragon.getSpecificQuestion();
			break;
			
		case "Dwarf": 
			Dwarf dwarf = new Dwarf();
			race = dwarf.getRaceName();
			language = dwarf.getLanguage();
			constitution = dwarf.getConstitution();
			specific = dwarf.getSpecificQuestion();
			break;
		
		case "Elf": 
			Elf elf = new Elf();
			race = elf.getRaceName();
			language = elf.getLanguage();
			dexterity = elf.getDexterity();
			specific = elf.getSpecificQuestion();
			
			break;
		
		case "Gnome": 
			Gnome gnome = new Gnome();
			race = gnome.getRaceName();
			language = gnome.getLanguage();
			intelligence = gnome.getIntelligence();
			specific = gnome.getSpecificQuestion();
			break;
			
		case "Half_Elf": 
			Half_Elf halfelf = new Half_Elf();
			race = halfelf.getRaceName();
			language = halfelf.getLanguage();
			charisma = halfelf.getCharisma();
			specific = halfelf.getSpecificQuestion();
			
			break;
		
		case "Half_Orc": 
			Half_Orc halforc = new Half_Orc();
			race = halforc.getRaceName();
			language = halforc.getLanguage();
			strength = halforc.getStrength();
			specific = halforc.getSpecificQuestion();
			break;
		
		case "Halfling": 
			Halfling halfling = new Halfling();
			race = halfling.getRaceName();
			language = halfling.getLanguage();
			dexterity = halfling.getDexterity();
			specific = halfling.getSpecificQuestion();
			break;
			
		case "Human": 
			Human human = new Human();
			race = human.getRaceName();
			language = human.getLanguage();
			charisma = human.getCharisma();
			constitution = human.getConstitution();
			dexterity = human.getDexterity();
			intelligence = human.getIntelligence();
			strength = human.getStrength();
			wisdom = human.getWisdom();
			specific = human.getSpecificQuestion();
			break;
			
		case "Tiefling": 
			Tiefling tiefling = new Tiefling();
			race = tiefling.getRaceName();
			language = tiefling.getLanguage();
			charisma = tiefling.getCharisma();
			specific = tiefling.getSpecificQuestion();
			break;
			
		default:
			throw new IllegalArgumentException("Invalid race: " + name);
		}
	}
	
	//setter methods
	protected void setRaceName(String name) {
		this.race = name;
	}
	protected void setCharisma(int value) {
		this.charisma = value;			
	}
	protected void setStrength(int value) {
		this.strength = value;
	}
	protected void setDexterity(int value) {
		this.dexterity = value;
	}
	protected void setIntelligence(int value) {
		this.intelligence = value;
	}
	protected void setConstitution(int value) {	
		this.constitution = value;
	}
	protected void setWisdom(int value) {	
		this.wisdom = value;	
	}
	protected void setLanguage(String s) {
		this.language = s;
	}
	protected void setSpecificQuestion(String s) {
		this.specific = s;
	}
	
	//getter methods
	public String getRaceName() {
		return race;
	}
	public int getCharisma() {
		return charisma;
	}
	public int getStrength() {
		return strength;
	}	
	public int getDexterity() {
		return dexterity;		
	}
	public int getIntelligence() {
		return intelligence;		
	}
	public int getConstitution() {
		return constitution;		
	}
	public int getWisdom() {		
		return wisdom;
	}	
	public String getLanguage() {
		return language;
	}
	public String getSpecificQuestion() {
		return specific;	
	}	
}


	
