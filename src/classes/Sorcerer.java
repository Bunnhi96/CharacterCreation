package classes;

public class Sorcerer extends BaseClass{
	private String class_name = "Zauberer";
	private String specificQuestion ="Magieabstammung: ";
	
	public Sorcerer() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(3,10);
		setCharisma(attributes[5]);
		setConstitution(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setIntelligence(attributes[3]);
			setStrength(attributes[2]);
			setDexterity(attributes[1]);
			setWisdom(attributes[0]);
		}
		else {		
			setIntelligence(attributes[0]);
			setStrength(attributes[1]);
			setDexterity(attributes[2]);
			setWisdom(attributes[3]);
		}

		setSpecificQuestion(specificQuestion);
	}
}
