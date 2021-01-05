import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.swing.*;

import classes.BaseClass;
import races.BaseRace;




public class CharacterQuestions extends CharacterGUI{
	private boolean baserace = false;
	private boolean baseclass = false;
//	private int charisma = 0;
//	private int constitution = 0;
//	private int intelligence = 0;
//	private int strength = 0;
//	private int dexterity = 0;
//	private int widsom = 0;
	private BaseRace base_race;
	private BaseClass base_class;
	private Background base_personality;
	private String attribute = "strength";
	private String personality = "urchin";
	private int p = 0;
	
	CharacterQuestions(){
		setGUI();
		//setAttributes();
	}
	
//	public void setAttributes() {
//		charisma = base_race.getCharisma() + base_class.getCharisma();
//		constitution = base_race.getConstitution() + base_class.getConstitution();
//		intelligence = base_race.getIntelligence() + base_class.getIntelligence();
//		strength = base_race.getStrength() + base_class.getStrength();
//		dexterity = base_race.getDexterity() + base_class.getDexterity();
//		widsom = base_race.getWisdom() + base_class.getWisdom();
//	}

	//read documents
	public void readFromFile(String doc) {
		String newline = "\n";
		String doc_text = "";
		int count = 0;
		String line=""; 		
		
		try{
			//input stream for reading special characters in germany	
			//documents from folder textfiles
        	BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("textfiles/" + doc),StandardCharsets.UTF_8));
        	while ((line=rd.readLine()) != null) {
        		//question/text
        		if (count == 0) {
        			doc_text = doc_text + line + newline;	
        		}
        		
        		//buttonname;next document;information
        		if (count == 1) {
        			String[] tokens = line.split(";");
        			JButton button = new JButton (tokens[0]);
        			button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        			panel.add(button);

        			if (tokens.length == 1) {
        				if(baserace == true && baseclass == false) {
        					button.addActionListener( new ActionListener() {
    							public void actionPerformed(ActionEvent ae) {
    								if(ae.getSource() == button) {
    									clearPanel();
    									readFromFile("/question_class/question_class_" + attribute + ".txt");
    								}
    							}
    	        				
    	        			});
        				}
        				if(baserace == true && baseclass == true) {
        					button.addActionListener( new ActionListener() {
    							public void actionPerformed(ActionEvent ae) {
    								if(ae.getSource() == button) {
    									clearPanel();
    									readFromFile("question_backgrounds" + ".txt");
    								}
    							}
    	        				
    	        			});
        				}
        				
        			}
        			
        			if (tokens.length > 1) {			
        				button.addActionListener( new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								if(ae.getSource() == button) {
									
									
									//choose attribute for race and class
									if(doc.equals("question_1.txt")) {
			        					String attribute_tokens [] = tokens[1].split("_");
			        					attribute = attribute_tokens[3];
			        					//System.out.println(attribute);
			        					clearPanel();
										readFromFile(tokens[1]+".txt");	
			        				}
									
									//choose personality
									if(doc.equals("question_backgrounds.txt")) {
										personality = tokens[1];
			        	        		base_personality = new Background();
			        	        		base_personality.setPersonality(tokens[0]);
			        	        		clearPanel();
			        	        		readFromFileBackground("question_personalities/" + personality + "/question_personality_" + personality + ".txt");
			        				}
									else {
										clearPanel();
										readFromFile(tokens[1]+".txt");
									}
									
									
									
									
								}
							}
	        				
	        			});
        				if (tokens.length > 2) {
        					if (baserace == false && baseclass == false) {
        						base_race = new BaseRace();
        						base_race.setRace(tokens[2]);
        						baserace = true;
        					}
        					
        					if (baserace == true && baseclass == false) {
        						base_class = new BaseClass();
        						base_class.setClass(tokens[2]);
        						baseclass = true;

        					}     					
     					
        				}
        			
        			}
        			
        		}
        		
        		
        		//empty line
		        if (line.length() == 0) {
		        	count++;
		        	txt.setText(doc_text);
        			panel.add(txt);
		        }
		        
        	}
        	rd.close();
        } catch(Exception e){
			e.printStackTrace();
		}
		setFrameContent();
	}
	
	public void readFromFileBackground(String doc) {
		String newline = "\n";
		String doc_text = "";
		String line=""; 		
		int count = 0;
		try{
			//input stream for reading special characters in germany	
			//documents from folder textfiles
        	BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("textfiles/" + doc),StandardCharsets.UTF_8));
        	while ((line=rd.readLine()) != null) {
        		
        		if (count == 0) {
        			doc_text = doc_text + line + newline;	
        		}
        		
        		
        		if (count == 1) {
        			String[] tokens = line.split(";");
        			System.out.println(tokens[0]);
        			JButton button = new JButton (tokens[0]);
        			button.setFont(new Font("Tahoma", Font.PLAIN, 20));
    				panel.add(button);
        		
           			if (p == 0) {	
        				button.addActionListener( new ActionListener() {
    						public void actionPerformed(ActionEvent ae) {
    							if(ae.getSource() == button) {
    								clearPanel();
    								base_personality.setPersonalityTrait(tokens[1]);
    								p++;
    								readFromFileBackground("/question_personalities/" + personality + "/question_ideal_" + personality + ".txt");
    							}
    						}
            				
            			});
            		}
        			
           			if (p == 1) {		
        				button.addActionListener( new ActionListener() {
    						public void actionPerformed(ActionEvent ae) {
    							if(ae.getSource() == button) {
    								clearPanel();
    								base_personality.setIdeal(tokens[1]);
    								p++;
    		        				readFromFileBackground("/question_personalities/" + personality + "/question_bond_" + personality + ".txt");
    							}
    						}
            				
            			});
        			}
           			
        			if (p == 2) {	
        				button.addActionListener( new ActionListener() {
    						public void actionPerformed(ActionEvent ae) {
    							if(ae.getSource() == button) {
    								clearPanel();
    								base_personality.setBond(tokens[1]);
    								p++;
    		        				readFromFileBackground("/question_personalities/" + personality + "/question_flaw_" + personality + ".txt");
    							}
    						}
            				
            			});
        				
        			}
        			if (p == 3) {	
        				
        				button.addActionListener( new ActionListener() {
    						public void actionPerformed(ActionEvent ae) {
    							if(ae.getSource() == button) {
    								clearPanel();
    								base_personality.setFlaw(tokens[1]);
    								
    		                		showResults();
    							}
    						}
            				
            			});
        		
        			}
        		}
        			
        			//empty line
    		        if (line.length() == 0) {
    		        	count++;
    		        	txt.setText(doc_text);
            			panel.add(txt);
    		        }
        		}
  
		        
        	
        	rd.close();
        } catch(Exception e){
			e.printStackTrace();
		}
		setFrameContent();
		
	}
	
	
	public void showResults(){
		String newline = "\n";
		clearPanel();
 		txt.setText("Anhand deiner Antworten wurde folgender Charakter für dich erstellt:" + newline);
		txt.append("Hintergrund: " + base_personality.getPersonality() + newline);
		txt.append("Persönlichkeitsmerkmal: " + base_personality.getPersonalityTrait()+ newline);
		txt.append("Ideal: " + base_personality.getIdeal()+ newline);
		txt.append("Bindung: " + base_personality.getBond()+ newline);
		txt.append("Makel: " + base_personality.getFlaw()+ newline);

		panel.add(txt);
		
		
		
		JButton restart = new JButton ("Neustart");
		restart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(restart);
		restart.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == restart) {
					clearPanel();
					Character c = new Character();
				}
			}
			
		});
		
		JButton close = new JButton ("Beenden");
		close.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(close);
		close.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == close) {
					frame.dispose();
				}
			}
			
		});

			
		setFrameContent();
		
	}
	
	//method for set Frame Content
	public void setFrameContent() {
		frame.setContentPane(panel);
	    frame.setVisible(true);
	}
	
	
	//method for clearing the panel
	public void clearPanel() {
		panel.removeAll();
		// to reset layout
		panel.revalidate();
		panel.repaint();
	}

	
	
}
