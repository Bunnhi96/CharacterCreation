package classes;

public class Barbarian extends BaseClass {
	private String class_name = "Barbar";
	
	public Barbarian() {
		setClassName(class_name);
		setStartGold(2,10);
		setStrength(attributes[5]);
		setConstitution(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setCharisma(attributes[0]);
			setDexterity(attributes[1]);
			setWisdom(attributes[2]);		
			setIntelligence(attributes[3]);	
		}
		else {
			setCharisma(attributes[3]);
			setDexterity(attributes[2]);
			setWisdom(attributes[1]);		
			setIntelligence(attributes[0]);	
			
		}
		
		setSpecificQuestion("Du bist geübt in folgenden Waffen: ");
	}

}
