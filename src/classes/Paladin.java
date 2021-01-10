package classes;

public class Paladin extends BaseClass {
	private String class_name = "Paladin";
	public Paladin() {
		setClassName(class_name);
		setStartGold(5,10);
		setStrength(attributes[5]);
		setCharisma(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setConstitution(attributes[1]);
			setDexterity(attributes[2]);
			setWisdom(attributes[3]);		
			setIntelligence(attributes[0]);	
		}
		else {
			setConstitution(attributes[2]);
			setDexterity(attributes[1]);
			setWisdom(attributes[0]);		
			setIntelligence(attributes[3]);	
			
		}

		setSpecificQuestion("Du trägst immer folgendes bei dir: ");
	}
	
}
