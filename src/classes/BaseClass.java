package classes;

import java.util.Arrays;
import java.util.Random;

//class for Character class

public class BaseClass {
	//default
	private String name_class = "";
	private int charisma = 0;
	private int wisdom = 0;
	private int dexterity = 0;
	private int strength = 0;
	private int intelligence = 0;
	private int constitution = 0;
	private String specific = "";
	private int gold = 0;
	private Random rdm = new Random();
	protected int [] attributes = new int[6];
	protected int oddoreven = rdm.nextInt(11);
	

	//depending on which class the user choose -> new class
	public void setClass(String name) {
		switch(name) {
		case "Barbarian":
			Barbarian barbarian = new Barbarian();
			
			//to save information of specific class in base class 
			name_class = barbarian.getClassName();
			charisma = barbarian.getCharisma();
			constitution = barbarian.getConstitution();
			dexterity = barbarian.getDexterity();
			intelligence = barbarian.getIntelligence();
			strength = barbarian.getStrength();
			wisdom = barbarian.getWisdom();
			specific = barbarian.getSpecificQuestion();
			gold = barbarian.getStartGold();
			break;
		case "Bard": 
			Bard bard = new Bard();
			name_class = bard.getClassName();
			charisma = bard.getCharisma();
			constitution = bard.getConstitution();
			dexterity = bard.getDexterity();
			intelligence = bard.getIntelligence();
			strength = bard.getStrength();
			wisdom = bard.getWisdom();
			specific = bard.getSpecificQuestion();
			gold = bard.getStartGold();
			break;
		case "Cleric": 
			Cleric cleric = new Cleric();
			name_class = cleric.getClassName();
			charisma = cleric.getCharisma();
			constitution = cleric.getConstitution();
			dexterity = cleric.getDexterity();
			intelligence = cleric.getIntelligence();
			strength = cleric.getStrength();
			wisdom = cleric.getWisdom();
			specific = cleric.getSpecificQuestion();
			gold = cleric.getStartGold();
			break;
		case "Druid": 
			Druid druid = new Druid();
			name_class = druid.getClassName();
			charisma = druid.getCharisma();
			constitution = druid.getConstitution();
			dexterity = druid.getDexterity();
			intelligence = druid.getIntelligence();
			strength = druid.getStrength();
			wisdom = druid.getWisdom();
			specific = druid.getSpecificQuestion();
			gold = druid.getStartGold();
			break;
		
		case "Fighter": 
			Fighter fighter = new Fighter();
			name_class = fighter.getClassName();
			charisma = fighter.getCharisma();
			constitution = fighter.getConstitution();
			dexterity = fighter.getDexterity();
			intelligence = fighter.getIntelligence();
			strength = fighter.getStrength();
			wisdom = fighter.getWisdom();
			specific = fighter.getSpecificQuestion();
			gold = fighter.getStartGold();
			break;
		case "Monk": 
			Monk monk = new Monk();
			name_class = monk.getClassName();
			charisma = monk.getCharisma();
			constitution = monk.getConstitution();
			dexterity = monk.getDexterity();
			intelligence = monk.getIntelligence();
			strength = monk.getStrength();
			wisdom = monk.getWisdom();
			specific = monk.getSpecificQuestion();
			gold = monk.getStartGold();
			break;
		
		case "Paladin": 
			Paladin paladin = new Paladin();
			name_class = paladin.getClassName();
			charisma = paladin.getCharisma();
			constitution = paladin.getConstitution();
			dexterity = paladin.getDexterity();
			intelligence = paladin.getIntelligence();
			strength = paladin.getStrength();
			wisdom = paladin.getWisdom();
			specific = paladin.getSpecificQuestion();
			gold = paladin.getStartGold();
			break;
		
		case "Ranger": 
			Ranger ranger = new Ranger();
			name_class = ranger.getClassName();
			charisma = ranger.getCharisma();
			constitution = ranger.getConstitution();
			dexterity = ranger.getDexterity();
			intelligence = ranger.getIntelligence();
			strength = ranger.getStrength();
			wisdom = ranger.getWisdom();
			specific = ranger.getSpecificQuestion();
			gold = ranger.getStartGold();
			break;
			
		case "Rogue": 
			Rogue rogue = new Rogue();
			name_class = rogue.getClassName();
			charisma = rogue.getCharisma();
			constitution = rogue.getConstitution();
			dexterity = rogue.getDexterity();
			intelligence = rogue.getIntelligence();
			strength = rogue.getStrength();
			wisdom = rogue.getWisdom();
			specific = rogue.getSpecificQuestion();
			gold = rogue.getStartGold();
			break;
			
		case "Sorcerer": 
			Sorcerer sorcerer = new Sorcerer();
			name_class = sorcerer.getClassName();
			charisma = sorcerer.getCharisma();
			constitution = sorcerer.getConstitution();
			dexterity = sorcerer.getDexterity();
			intelligence = sorcerer.getIntelligence();
			strength = sorcerer.getStrength();
			wisdom = sorcerer.getWisdom();
			specific = sorcerer.getSpecificQuestion();
			gold = sorcerer.getStartGold();
			break;
			
		case "Wizard": 
			Wizard wizard = new Wizard();
			name_class = wizard.getClassName();
			charisma = wizard.getCharisma();
			constitution = wizard.getConstitution();
			dexterity = wizard.getDexterity();
			intelligence = wizard.getIntelligence();
			strength = wizard.getStrength();
			wisdom = wizard.getWisdom();
			specific = wizard.getSpecificQuestion();
			gold = wizard.getStartGold();
			break;
			
		case "Warlock": 
			Warlock warlock = new Warlock();
			name_class = warlock.getClassName();
			charisma = warlock.getCharisma();
			constitution = warlock.getConstitution();
			dexterity = warlock.getDexterity();
			intelligence = warlock.getIntelligence();
			strength = warlock.getStrength();
			wisdom = warlock.getWisdom();
			specific = warlock.getSpecificQuestion();
			gold = warlock.getStartGold();
			break;
		
			
		default:
			throw new IllegalArgumentException("Invalid class: " +  name);
		}
	}
	
	public void diceAttributes() {
		for (int i = 0; i < attributes.length ; i++) {
			int value = 0;
			int [] dices = new int [4];
			for(int j = 0; j < dices.length; j++) {
				dices[j] = rdm.nextInt(6) + 1;
				value += dices[j];
			}
			
			attributes[i] = value - findMinimum(dices);
			
		
		}
		//sort array min to max
		Arrays.sort(attributes);
		
	}
	
	public int findMinimum(int [] dices) {
		int min = dices[0];		 
		for (int i = 0; i < dices.length; i++) {
			if (min > dices[i]) {
				min = dices[i];
			}			
		}
		return min;
	}
	
	
	//setter methods
	
	public void setClassName(String name) {
		this.name_class = name;
	}

	public void setCharisma(int value) {
		this.charisma = value;
	}
	public void setStrength(int value) {
		this.strength = value;
	}
	public void setDexterity(int value) {
		this.dexterity = value;
	}
	public void setIntelligence(int value) {
		this.intelligence = value;
	}
	public void setConstitution(int value) {	
		this.constitution = value;
	}
	public void setWisdom(int value) {
		this.wisdom = value;
	}
	
	public void setStartGold(int amount, int multi) {	
		for (int i = 0; i<amount;i++) {
			this.gold += rdm.nextInt(4)+1;
		}
		this.gold *= multi;
	}
	
	public void setSpecificQuestion(String s) {
		this.specific = s;
	}
	
	//getter methods
	public String getClassName() {
		return name_class;
	}
	public int getCharisma() {
		System.out.println("Charisma class get " + charisma);
		return charisma;
	}
	public int getStrength() {
		return strength;
	}
	public int getDexterity() {
		return dexterity;		
	}
	public int getIntelligence() {
		return intelligence;		
	}
	public int getConstitution() {
		return constitution;		
	}
	public int getWisdom() {
		return wisdom;
	}
	public int getStartGold() {
		return gold;
	}
	public String getSpecificQuestion() {
		return specific;
	}
	
}
