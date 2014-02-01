package ex3;

import java.util.Comparator;

public class TriMilitaireComparator implements Comparator<String> {


	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
		{
			return -1;
		}
		else if (s1.length() > s2.length())
		{
			return 1;
		}
		else 
		{
			return s1.compareTo(s2);
		}
	}

}
