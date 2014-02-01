package ex3;

import java.util.Collections;
import java.util.List;

public class TriMilitaire {

	
	private List<String> strs;
	
	public List<String> getStrings() {
		return this.strs;
	}
	
	public TriMilitaire(List<String> strs) {
		this.strs = strs;
		sort();
	}
	
	private void sort(){
		Collections.sort(this.strs, new TriMilitaireComparator());
	}
	
}
