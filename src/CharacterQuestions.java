import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import classes.BaseClass;
import races.BaseRace;


public class CharacterQuestions extends CharacterGUI{
	//check if race and class is already set
	private boolean baseRace = false;
	private boolean baseClass = false;
	private boolean randomButton = false;
	
	//save specific answers of specific race/class
	private String specific_race="";
	private String specific_class="";	
	
	private BaseRace base_race = new BaseRace();
	private BaseClass base_class = new BaseClass();
	private Background base_personality = new Background();
	
	//default chosen values
	private String attribute = "";
	private String personality = "";
	
	//background counter
	private int bg = 0;
	
	//attributes
	private int charisma = 0;
	private int constitution = 0;
	private int intelligence = 0;
	private int strength = 0;
	private int dexterity = 0;
	private int wisdom = 0;
	
	//for random button
	private Random rdm = new Random();
	private int randomInt = 0;
	
	CharacterQuestions(){
		//creates frame, panel and textarea
		setGUI();
	}

	//read documents 1. -  5. question
	public void readFromFile(String doc) {
		String newline = "\n";
		String doc_text = "";
		int count = 0;
		String line="";
		
		//for random button
		int buttoncount = 0;
		ArrayList<JButton> list = new ArrayList<JButton>();
		
		try{
			//input stream for reading special characters in German	
			//documents from folder textfiles
        	BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("textfiles/" + doc),StandardCharsets.UTF_8));
        	while ((line=rd.readLine()) != null) {
        		//question text
        		if (count == 0) {
        			
        			switch(bg) {
    				case(1):
        				doc_text = "Dein Charakter lässt sich durch 4 Merkmale beschreiben.\r\n" + 
        						"Wähle als 1. dein Persönlichkeitsmerkmal:" + newline;
    					count++;
        				break;
        			case(2):
        				doc_text = "Wähle das 2. Merkmal ein Ideal:" + newline;
        				count++;
        				break;
        			case(3):
        				doc_text = "Entscheide dich als nächstes für eine Bindung:"+ newline;
        				count++;
        				break;
        			case(4):
        				doc_text = "Deine letzte Frage. Im Anschluss wird dein Charakter generiert.\r\n" + 
        						"Wähle ein Makel der dich beschreibt:"+ newline;
        				count++;
        				break;
        			default:
        				doc_text = doc_text + line + newline;
        				break;
        			}
        			txt.setText(doc_text);
        			if(randomButton == true) {
		        		txt.setVisible(false);
    				}
        			panelA.add(txt);
        		}
        		
        		//buttonname;next document(;information)
        		if (count == 1) {
        			String[] tokens = line.split(";");
        			JButton button = new JButton (tokens[0]);
    				button.setFont(new Font("Rockwell", Font.PLAIN, 24));
        			//for random button: add buttons to a list and count them
        			list.add(button);
        			buttoncount++;
    				if(randomButton == true) {
    					button.setVisible(false);
    				}
    				
    				panelB.add(button);
					button.addActionListener( new ActionListener() {
						public void actionPerformed(ActionEvent ae) {
							if(ae.getSource() == button) {
								if (tokens.length == 1) {								
									clearPanel();												
									//if race is already set but class not yet, than read question for class
									if(baseRace == true && baseClass == false) {
    									specific_race = tokens[0];
    									readFromFile("/question_class/question_class_" + attribute + ".txt");
									}
									
									//if race and class is already set -> open question for background
									else if(baseRace == true && baseClass == true) {
			        					specific_class = tokens[0];
    									readFromFile("question_backgrounds" + ".txt");
			        				}
								}
								
								
								if (tokens.length > 1) {
									//Buttonname/tokens[0];[tokens[1];tokens[2] 
									if (tokens.length>2) {
										if (baseRace == false && baseClass == false) {
			        						base_race.setRace(tokens[2]);
			        						baseRace = true;
			        					}
										else if (baseRace == true && baseClass == false) {
			        						base_class.setClass(tokens[2]);
			        						baseClass = true;

			        					}     		
									}
									
									//random button
									if (tokens[0].equals("Zufallscharakter erstellen")) {											
										randomButton = true;
										clearPanel();
										readFromFile(tokens[1] + ".txt");
									}
									
									//choose main attribute for race and class
									else if(doc.equals("question_1.txt")) {
			        					String attribute_tokens [] = tokens[1].split("_");
			        					attribute = attribute_tokens[3];
			        					clearPanel();
										readFromFile(tokens[1]+".txt");	
			        				}
									
									//choose background personality
									else if(doc.equals("question_backgrounds.txt")) {
										personality = tokens[1];
			        	        		base_personality.setPersonality(tokens[0]);
			        	        		clearPanel();
			        	        		bg++;
			        	        		readFromFile("question_personalities/" + personality + "/question_personality_" + personality + ".txt");
			        				}
									
									//background
									else if (bg == 1) {	
										bg++;
	    								base_personality.setPersonalityTrait(tokens[1]);
	    								clearPanel();
	    								readFromFile("/question_personalities/" + personality + "/question_ideal_" + personality + ".txt");
									}
									else if (bg == 2) {
										bg++;
										base_personality.setIdeal(tokens[1]);
										clearPanel();
	    		        				readFromFile("/question_personalities/" + personality + "/question_bond_" + personality + ".txt");
									}
									else if (bg == 3) {	
										bg++;
	    								base_personality.setBond(tokens[1]);
	    								clearPanel();
	    		        				readFromFile("/question_personalities/" + personality + "/question_flaw_" + personality + ".txt");	    		    			        				
				        			}  								
									else if (bg == 4) {
										bg = 0;
	    								base_personality.setFlaw(tokens[1]);
	    								setAttributes();
	    		                		showResults();
	    		                		
				        			}
									else {
										clearPanel();
										readFromFile(tokens[1]+".txt");
									}
									
								}
									
									
							}
						}
	    	        				
        			});  //actionlistener close  
        			
        		} //if count == 1 end

        		//empty line
		        if (line.length() == 0) {
		        	count++;
		        	txt.setText(doc_text);
		        	if(randomButton == true) {
		        		txt.setVisible(false);
    				}
		        	panelA.add(txt);
		        }
		        
        	} // while end
        	
			
        	rd.close();
        	
        } //try
		catch(Exception e){
			e.printStackTrace();
		}
		setFrameContent();
		if(randomButton == true) {
			randomInt = rdm.nextInt(buttoncount);	
			list.get(randomInt).doClick();
		}
	}
	
	
	public void setAttributes() {
		charisma += base_race.getCharisma() + base_class.getCharisma();
		constitution += base_race.getConstitution() + base_class.getConstitution();
		intelligence += base_race.getIntelligence() + base_class.getIntelligence();
		strength += base_race.getStrength() + base_class.getStrength();
		dexterity += base_race.getDexterity() + base_class.getDexterity();
		wisdom += base_race.getWisdom() + base_class.getWisdom();
		
		//bonus attributes for specific races
		switch(specific_race) {
		case "Waldelf":
			wisdom +=1;
			break;
		case "Hochelf": 
			intelligence +=1;
			break;
		case "Dunkelelf": 
			charisma +=1;
			break;
		case "Felsengnom": 
			constitution +=1;
			break;
		case "Waldgnom": 
			dexterity +=1;
			break;
		case "Hügelzwerg": 
			wisdom +=1;
			break;
		case "Gebirgszwerg": 
			strength +=1;
			break;
		case "Leichtfuß": 
			charisma +=1;
			break;
		case "Stämmiger": 
			constitution +=1;
			break;
			
		default:
			break;
		}
	}
	
	//floorDiv -> if result of a division is negative -> no round to zero, but to negative infinity.
	public int calculateModifiers(int value) {
		int result = (value - 10);
		return Math.floorDiv(result,2);
	}
	

	//show results
	public void showResults(){
		String newline = "\n";
		clearPanel();
		txt.setVisible(true);
 		txt.setText("Anhand deiner Antworten wurde folgender Charakter für dich erstellt:" + newline); 		
 		txt.append(newline + "Volk: " + base_race.getRaceName() + newline);
 		txt.append(base_race.getSpecificQuestion() + specific_race + newline);
 		txt.append("Klasse: " + base_class.getClassName() + newline);
 		txt.append(base_class.getSpecificQuestion() + specific_class + newline);
 		txt.append("Sprachen: " + base_race.getLanguage() + newline);
		txt.append("Startgoldmünzen: " + base_class.getStartGold() + newline);

		txt.append(newline + "Hintergrund: " + base_personality.getPersonality() + newline);
		txt.append("Persönlichkeitsmerkmal: " + base_personality.getPersonalityTrait()+ newline);
		txt.append("Ideal: " + base_personality.getIdeal()+ newline);
		txt.append("Bindung: " + base_personality.getBond()+ newline);
		txt.append("Makel: " + base_personality.getFlaw()+ newline);
		
		//attributes value
		txt.append(newline + "Deine Attributswerte: " + newline);
		txt.append("Stärke: " + strength + newline);
		txt.append("Stärke-Modifikator: " + calculateModifiers(strength)+ newline);
		txt.append("Geschicklichkeit: " + dexterity+ newline);
		txt.append("Geschicklichkeit-Modifikator: " + calculateModifiers(dexterity)+ newline);
		txt.append("Konstitution: " + constitution+ newline);
		txt.append("Konstitution-Modifikator: " + calculateModifiers(constitution)+ newline);
		txt.append("Intelligenz: " + intelligence+ newline);
		txt.append("Intelligenz-Modifikator: " + calculateModifiers(intelligence)+ newline);
		txt.append("Weisheit: " + wisdom+ newline);
		txt.append("Weisheit-Modifikator: " + calculateModifiers(wisdom)+ newline);
		txt.append("Charisma: " + charisma+ newline);
		txt.append("Charisma-Modifikator: " +calculateModifiers(charisma)+ newline);
		txt.append(newline + "Trage alle Informationen auf deinen Charakterbogen ein." + newline);
		txt.append("Alle weiteren Informationen zum Charakter (z.B.: Fertigkeiten, Ausrüstung, etc.) findest du im jeweiligen Kapitel des Regelwerkes: " + newline);
		txt.append("B. Cordell, J. Wyatt und R. J. Schwalb, Dungeons & Dragons Players Handbook - Spielerhandbuch, Litauen: Gale Force Nine, 2018." + newline);
		//decrease font size
		txt.setFont(new Font("Rockwell", Font.PLAIN, 22));
		panelA.add(txt);
		
		System.out.println("TEST");
		
		//restart button
		JButton restart = new JButton ("Neustart");
		restart.setFont(new Font("Rockwell", Font.PLAIN, 30));
		panelB.add(restart);
		restart.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == restart) {
					clearPanel();
					frame.dispose();
					Character c = new Character();
				}
			}
			
		});
		
		//close program button
		JButton close = new JButton ("Beenden");
		close.setFont(new Font("Rockwell", Font.PLAIN, 30));
		panelB.add(close);
		close.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == close) {
					frame.dispose();
				}
			}
			
		});
	}
	
	//method for set Frame Content
	public void setFrameContent() {
		bigPanel.add(panelA);
		bigPanel.add(panelB);
		frame.add(bigPanel);
		//frame.add(panel);
	    frame.setVisible(true);
	}
	
	//method for clearing the panel
	public void clearPanel() {
		panelA.removeAll();
		panelB.removeAll();
		// to reset layout
		panelA.revalidate();
		panelA.repaint();
		panelB.revalidate();
		panelB.repaint();	
	}

	
}
