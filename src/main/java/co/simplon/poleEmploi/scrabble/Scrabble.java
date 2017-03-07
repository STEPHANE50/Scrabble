package co.simplon.poleEmploi.scrabble;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scrabble {
	 public Map<String, Integer> getAssociationValeurLettre() {
		return associationValeurLettre;
	}

	public void setAssociationValeurLettre(Map<String, Integer> associationValeurLettre) {
		this.associationValeurLettre = associationValeurLettre;
	}

	public Scrabble() {
		super();
		associationValeurLettre = new HashMap<>();
		associationValeurLettre.put( "a",1);
		associationValeurLettre.put( "e",1);
		associationValeurLettre.put( "i",1);
		associationValeurLettre.put( "o",1);
		associationValeurLettre.put( "u",1);
		associationValeurLettre.put( "l",1);
		associationValeurLettre.put( "n",1);
		associationValeurLettre.put( "r",1);
		associationValeurLettre.put( "s",1);
		associationValeurLettre.put( "t",1);
		associationValeurLettre.put( "d",2);
		associationValeurLettre.put( "g",2);
		associationValeurLettre.put( "b",3);
		associationValeurLettre.put( "c",3);
		associationValeurLettre.put( "m",3);
		associationValeurLettre.put( "p",3);
		associationValeurLettre.put( "f",4);
		associationValeurLettre.put( "h",4);
		associationValeurLettre.put( "v",4);
		associationValeurLettre.put( "q",8);
		associationValeurLettre.put( "k",10);
		associationValeurLettre.put( "w",10);
		associationValeurLettre.put( "x",10);
		associationValeurLettre.put( "y",10);
		associationValeurLettre.put( "z",10);
	}                                   

	private Map<String,Integer> associationValeurLettre;
	private Integer getValeur;
	
	

	public int getValeur(char c) {
		// TODO Auto-generated method stub
		getValeur = associationValeurLettre.get(getAssociationValeurLettre());
		return 0;
	}

	public int getValeur(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getLettresDeValeur(int i) {
		// TODO Auto-generated method stub
		return "";
	}

}
