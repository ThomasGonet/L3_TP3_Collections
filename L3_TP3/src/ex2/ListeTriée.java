package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListeTriée {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez  la méthode 1(tapez '1') ou la méthode 2(tapez '2'):");
		int methode = sc.nextInt();
		System.out.println("Entrer le nombe d'élément que vous voulez classer:");
		int nbElement = sc.nextInt();
		if(methode ==1)
			methode1(nbElement);
		else
			methode2(nbElement);

	}

	public static void methode1(int nb)
	{
		//System.out.println("nbel "+ nb);
		List<Integer> list = new ArrayList<Integer>(nb);
		for(int i = 0; i < nb; i++)
		{
			list.add((int) (Math.random() * 1000));
		}
		Collections.sort(list);
		System.out.println("Méthode 1 :");
		for(int i: list)
		{
			System.out.println(i);
		}
	}

	public static void methode2(int nb)
	{
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < nb; i++)
		{
			set.add((int) (Math.random() * 1000));
		}
		System.out.println("Méthode 2 :");
		for(int i : set)
			System.out.println(i);
	}



}
