package classes;

public class Monk extends BaseClass {
	private String class_name = "Mönch";
	public Monk() {
		setClassName(class_name);
		setStartGold(5,1);
		setDexterity(attributes[5]);
		setWisdom(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setConstitution(attributes[3]);
			setCharisma(attributes[2]);
			setIntelligence(attributes[1]);
			setStrength(attributes[0]);
		}
		else {
			setConstitution(attributes[0]);
			setCharisma(attributes[1]);
			setIntelligence(attributes[2]);
			setStrength(attributes[3]);
		}

		setSpecificQuestion("Du trägst immer folgendes bei dir: ");
	}

}
