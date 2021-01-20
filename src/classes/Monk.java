package classes;

public class Monk extends BaseClass {
	private String class_name = "Mönch";
	private String specificQuestion ="Du trägst immer folgendes bei dir: ";
	
	public Monk() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(5,1);
		if ((oddoreven % 2) == 0) {
			setDexterity(attributes[5]);
			setWisdom(attributes[4]);
			setConstitution(attributes[3]);
			setCharisma(attributes[2]);
			setIntelligence(attributes[1]);
			setStrength(attributes[0]);
		}
		else {
			setDexterity(attributes[4]);
			setWisdom(attributes[5]);
			setConstitution(attributes[0]);
			setCharisma(attributes[1]);
			setIntelligence(attributes[2]);
			setStrength(attributes[3]);
		}

		setSpecificQuestion(specificQuestion);
	}

}
