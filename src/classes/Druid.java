package classes;

public class Druid extends BaseClass {
	private String class_name = "Druide";
	private String specificQuestion ="Du bist geübt in foldenden Waffen: ";
	
	public Druid() {
		diceAttributes();
		setClassName(class_name);
		setStartGold(2,10);
		setWisdom(attributes[5]);
		setIntelligence(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setStrength(attributes[3]);		
			setDexterity(attributes[2]);
			setConstitution(attributes[1]);
			setCharisma(attributes[0]);
		}
		else {
			setDexterity(attributes[0]);	
			setStrength(attributes[1]);
			setConstitution(attributes[2]);
			setCharisma(attributes[3]);
			
		}
		setSpecificQuestion(specificQuestion);
	}

}
