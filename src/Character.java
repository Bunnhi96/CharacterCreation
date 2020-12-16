import java.util.Random;


public class Character {
	
	
//BASISKLASSE KLASSE UND BASISKLASSE VÖLKER die die CHaracterklasse benutzt
	
	public String race_name ="";
	public String class_name ="";
	public int attr_amount = 6;
	public Random rdn = new Random();
	public static int [] attr = new int [6];
	
	public void setRaceName () {
		System.out.println("Rasse: " + race_name);
	}
	
	public void setClassName () {
		System.out.println("Klasse: " + class_name);
	}
	
	
//	public void attributes() {
//		int charisma = 0;
//		int constitution = 0;
//		int strength = 0;
//		int intelligence = 0;
//		int dexterity = 0;
//		int wisdom = 0;		
//	}
	
	public void diceAttributes() {
		for (int i = 0; i < attr.length ; i++) {
			int value = 0;
			int [] dices = new int [4];
			for(int j = 0; j < dices.length; j++) {
				dices[j] = rdn.nextInt(6) + 1;
				System.out.println ("dices j" + dices[j]);
				value += dices[j];
			}
			System.out.println ("VALUE" + value);
			
			attr[i] = value - findMinimum(dices);
			 
		
		}
		
//		for (int element: dices) {
//            System.out.println(element);
//        }
//		
		
	}
	
	public int findMinimum(int [] dices) {
		int min = dices[0];		 
		for (int i = 0; i < dices.length; i++) {
			if (min > dices[i]) {
				min = dices[i];
			}
			
		}
		System.out.println ("MIN" + min);
		
		return min;
	}
	
	public void setup(){
		
      CharacterBuildingDescription desc = new CharacterBuildingDescription();
      desc.getDescriptionText();
        
	}
	
	
	
	public static void main(String[] args) {
		Character c = new Character();
		c.setup();
		c.setClassName();
		c.setRaceName();
		c.diceAttributes();
		for (int element: attr) {
            System.out.println(element);
        }
		
		
		
	 }

}
