package ex5;


import java.util.ArrayList;
import java.util.List;

public class TestGenerique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Generique<?, ?>> list = new ArrayList<>();
		
		list.add(new Generique<>("Toto", true));
		list.add(new Generique<>(4 , false));
		
		
		System.out.println(list.get(0).getT());
		System.out.println(list.get(0).getE());
		System.out.println(list.get(1).getT());
		System.out.println(list.get(1).getE());
		
		System.out.println("Après modifications :");
		
		((Generique<String, Boolean>)list.get(0)).setE(false);
		list.get(0).setT(null);
		((Generique<Integer, Boolean>)list.get(1)).setT(5);
		((Generique<Integer, Boolean>)list.get(1)).setE(true);
		
		System.out.println(list.get(0).getT());
		System.out.println(list.get(0).getE());
		System.out.println(list.get(1).getT());
		System.out.println(list.get(1).getE());
		
	}

}
