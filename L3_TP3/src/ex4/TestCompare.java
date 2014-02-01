package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;


public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne p1 = new Personne("Gon", "Tom", new GregorianCalendar(1992, 10, 5), new Adresse(12, "rue", "20600", "Bastia"));
		Personne p2 = new Personne("Gon", "Pa", new GregorianCalendar(1992, 10, 5), new Adresse(12, "rue", "20600", "Bastia"));
		Personne p3 = new Personne("Nom", "Prenom", new GregorianCalendar(1992, 10, 5), new Adresse(12, "rue", "20600", "Bastia"));
		Personne p4 = new Personne("nom", "Pa", new GregorianCalendar(1992,10,5), new Adresse(12, "rue", "20600", "Bastia"));
		
		List<Personne> lp = new ArrayList<Personne>();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		System.out.println("Avant tri");
		for(Personne p : lp)
			System.out.println(p);
		
		Collections.sort(lp);
		
		System.out.println("\nApres tri");
		for(Personne p : lp)
			System.out.println(p);
	}


}
