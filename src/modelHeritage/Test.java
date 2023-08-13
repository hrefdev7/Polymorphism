package modelHeritage;

public class Test {

	public static void main(String[] args) {
	  
		
	    Animal a1 = new Animal();

	    Animal a2 = new Chien();

	    Animal a3 = new Pigeon();
	    Animal a43 = new Chien();
	    

	    ((Chien) a43).doYourJob();
	    a1.deplacer();

	    a2.deplacer();

	    a3.deplacer();

	}

}
