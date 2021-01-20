package classes;

public class Cleric extends BaseClass{
	private String class_name = "Kleriker";
	private String specificQuestion ="Du verkörperst das Merkmal deiner Gottheit: ";
	
	public Cleric() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(5,10);
		setWisdom(attributes[5]);
		setCharisma(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setStrength(attributes[3]);		
			setIntelligence(attributes[2]);
			setDexterity(attributes[1]);
			setConstitution(attributes[0]);
		}
		else {
			setDexterity(attributes[0]);		
			setIntelligence(attributes[1]);
			setStrength(attributes[2]);
			setConstitution(attributes[3]);
			
		}
		setSpecificQuestion(specificQuestion);
	}
}

