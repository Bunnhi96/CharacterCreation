package classes;

public class Wizard extends BaseClass{
	private String class_name = "Magier";
	private String specificQuestion ="Du hast folgende Schule besucht: ";
	
	public Wizard() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(4,10);
		setIntelligence(attributes[5]);	
		setWisdom(attributes[4]);	
		if ((oddoreven % 2) == 0) {
			setDexterity(attributes[3]);
			setStrength(attributes[2]);
			setConstitution(attributes[1]);
			setCharisma(attributes[0]);
				
		}
		else {
			setStrength(attributes[0]);
			setDexterity(attributes[1]);
			setConstitution(attributes[2]);
			setCharisma(attributes[3]);
			
		}
		

		setSpecificQuestion(specificQuestion);
	}

}

