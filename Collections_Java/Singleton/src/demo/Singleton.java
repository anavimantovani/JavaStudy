package demo;

public class Singleton {
	
	private Singleton s;
	
	private Singleton(){
		
	}
	
	public Singleton getInstance() {
		if (s == null) 
			s = new Singleton();
		
		return s;
	}

}
