package classes;

public class Fighter extends BaseClass {
	private String class_name = "Kämpfer";
	public Fighter() {
		setClassName(class_name);
		setStartGold(5,10);
		setStrength(attributes[5]);
		setDexterity(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setConstitution(attributes[0]);
			setCharisma(attributes[1]);
			setWisdom(attributes[2]);		
			setIntelligence(attributes[3]);	
		}
		else {
			setConstitution(attributes[3]);
			setCharisma(attributes[2]);
			setWisdom(attributes[1]);		
			setIntelligence(attributes[0]);	
			
		}

		setSpecificQuestion("Spezialisiert auf Kampfstil: ");
	}

}
