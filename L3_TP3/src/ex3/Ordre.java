package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 3)
		{
			System.err.println("Nombre d'éléments insuffisant !");
		}
		else
		{
			List<String> strs = new ArrayList<String>();
			for(int i = 1; i < args.length; i++)
			{
				strs.add(args[i]);
			}
			
			String tri = args[0];
			
			printList("Avant tri", strs);
			
			if(tri.equals(Tri.lexico.toString()))
			{
				triLexico(strs);
			}
			else if( tri.equals(Tri.militaire.toString()))
			{
				triMilitaire(strs);
			}
			else if(tri.equals(Tri.inverse.toString()))
			{
				triInverse(strs);
			}
			else
			{
				System.out.println("Vous n'avez pas entré un type de tri valide !");
			}	
		}

	}
	
	private static void triLexico(List<String> strs)
	{
		Collections.sort(strs);
		printList("Tri lexical", strs);
	}
	
	private static void triMilitaire(List<String> strs)
	{
		TriMilitaire triM = new TriMilitaire(strs);
		printList("Tri Militaire", triM.getStrings());
	}
	
	private static void triInverse(List<String> strs)
	{
		Collections.sort(strs, Collections.reverseOrder());
		printList("Tri inverse", strs);
	}
	
	private static void printList(String tri,List<String> strs)
	{
		System.out.print(tri + " [ ");
		System.out.print(strs.get(0));
		for(int i = 1; i < strs.size(); i++)
			System.out.print(", "+ strs.get(i));
		
		System.out.print("].\n");
	}
}
