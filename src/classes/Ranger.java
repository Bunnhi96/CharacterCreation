package classes;

public class Ranger extends BaseClass{
	private String class_name = "Waldläufer";
	public Ranger() {
		setClassName(class_name);
		setStartGold(5,10);
		setDexterity(attributes[5]);
		setWisdom(attributes[4]);
		if ((oddoreven % 2) == 0) {
			setCharisma(attributes[3]);
			setConstitution(attributes[2]);
			setStrength(attributes[1]);
			setIntelligence(attributes[0]);
		}
		else {
			setCharisma(attributes[0]);			
			setConstitution(attributes[1]);
			setStrength(attributes[2]);
			setIntelligence(attributes[3]);
		}
		

		setSpecificQuestion("Du weißt alles Wissenswerte über: ");
	}
}
