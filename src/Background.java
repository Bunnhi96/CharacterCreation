//class that stores information about the background and personality of a character

public class Background {
	public String personality = "";
	String personality_trait = "";
	String ideal = "";
	String bond = "";
	String flaw = "";

	//setter class
	public String setPersonality(String text) {
		personality = text;
		return personality;
	}
	
	public String setPersonalityTrait(String text) {
		personality_trait = text;
		return personality_trait;
	}
	
	
	public String setIdeal(String text) {
		ideal = text;
		return ideal;
	}
	
	public String setBond(String text) {
		bond = text;
		return bond;
	}
	
	public String setFlaw(String text) {
		flaw = text;
		return flaw;
	}
	
	//getter class
	
	public String getPersonality() {
		return personality;
	}
	
	public String getPersonalityTrait() {
		return personality_trait;
	}
	
	public String getIdeal() {
		return ideal;
	}
	
	public String getBond() {
		return bond;
	}
	
	public String getFlaw() {
		return flaw;
	}
	
	
}
