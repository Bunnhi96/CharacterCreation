package classes;

public class Paladin extends BaseClass {
	private String class_name = "Paladin";
	private String specificQuestion ="Du trägst immer folgendes bei dir: ";
	
	public Paladin() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(5,10);
		if ((oddoreven % 2) == 0) {
			setStrength(attributes[5]);
			setCharisma(attributes[4]);
			setConstitution(attributes[1]);
			setDexterity(attributes[2]);
			setWisdom(attributes[3]);		
			setIntelligence(attributes[0]);	
		}
		else {
			setStrength(attributes[4]);
			setCharisma(attributes[5]);
			setConstitution(attributes[2]);
			setDexterity(attributes[1]);
			setWisdom(attributes[0]);		
			setIntelligence(attributes[3]);	
			
		}

		setSpecificQuestion(specificQuestion);
	}
	
}
