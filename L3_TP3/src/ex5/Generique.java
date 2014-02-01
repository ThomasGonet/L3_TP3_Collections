package ex5;

public class Generique<T, E> {
	private T t;
	private E E;
	
	public T getT()
	{
		return t;
	}
	
	public void setT(T t)
	{
		this.t = t;
	}
	
	public E getE()
	{
		return E;
	}
	
	public void setE(E E)
	{
		this.E = E;
	}
	
	public Generique(T t, E E) {
		this.t = t;
		this.E = E;
	}
}
