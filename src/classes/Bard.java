package classes;

public class Bard extends BaseClass{
	private String class_name = "Barde";
	public Bard() {
		setClassName(class_name);
		setStartGold(5,10);
		setCharisma(attributes[5]);
		setDexterity(attributes[4]);
		if ((oddoreven % 2) == 0) {			
			setWisdom(attributes[3]);		
			setIntelligence(attributes[2]);
			setStrength(attributes[1]);
			setConstitution(attributes[0]);
		}
		else {
			setWisdom(attributes[0]);		
			setIntelligence(attributes[1]);
			setStrength(attributes[2]);
			setConstitution(attributes[3]);
			
		}
		setSpecificQuestion("Du trägst immer folgendes bei dir: ");

	}

}
