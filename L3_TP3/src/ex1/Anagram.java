package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<String>> anagram = new HashMap<>();
		Scanner sc = null;
		Scanner scNb;
		int nb;
		try {
			sc = new Scanner(new File("dictionary.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String S, hash;
		char[] t;
		
		while(sc.hasNext())
		{
			S = sc.next();
			t = S.toCharArray();
			Arrays.sort(t);
			hash = new String(t);
			if(!anagram.containsKey(hash))
			{
				anagram.put(hash, new ArrayList<String>());
			}
			anagram.get(hash).add(S);
		}
		
		System.out.println("Enter le nombre d'anagrammes voulus :");
		scNb = new Scanner(System.in);
		nb = scNb.nextInt();
		Afficher(anagram, nb);
		sc.close();
		//System.out.println("");
	}

	private static void Afficher(Map<String, List<String>> anagram, int nb) {
		// TODO Auto-generated method stub
		String str = "\n";
		for(List<String> list : anagram.values())
		{
			int size = list.size();
			if(size >= nb)
			{
				str += size + ":[ ";
				for(String s: list)
				{
					str += s+", ";
				}
				str += "]\n";
			}

		}
		System.out.println(str);
	}

}
