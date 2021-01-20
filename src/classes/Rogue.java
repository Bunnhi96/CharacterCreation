package classes;

public class Rogue extends BaseClass {
	private String class_name = "Schurke";
	private String specificQuestion ="Du trägst immer folgendes bei dir: ";
	
	public Rogue() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(4,10);
		setDexterity(attributes[5]);
		setIntelligence(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setConstitution(attributes[3]);
			setCharisma(attributes[2]);
			setStrength(attributes[1]);
			setWisdom(attributes[0]);
		}
		else {		
			setConstitution(attributes[0]);
			setCharisma(attributes[1]);
			setStrength(attributes[2]);
			setWisdom(attributes[3]);
		}

		setSpecificQuestion(specificQuestion);
	}

}
