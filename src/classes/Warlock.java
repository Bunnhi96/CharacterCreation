package classes;

public class Warlock extends BaseClass{

	private String class_name = "Hexenmeister";
	private String specificQuestion ="Du hast einen Vertrag geschlossenen mit: ";
	
	public Warlock() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(4,10);
		setCharisma(attributes[5]);
		setWisdom(attributes[4]);
		
		if ((oddoreven % 2) == 0) {
			setIntelligence(attributes[3]);
			setStrength(attributes[2]);
			setConstitution(attributes[1]);
			setDexterity(attributes[0]);
		}
		
		else {		
			setIntelligence(attributes[0]);
			setStrength(attributes[1]);
			setConstitution(attributes[2]);
			setDexterity(attributes[3]);
		}
		
		setSpecificQuestion(specificQuestion);
		
	}
	
}

