package modelAbstract;


class JavaScript extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("JavaScript Programming Language");
	    System.out.println("*********************************");
	  }
	}
class Php extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Php Programming Language");
	    System.out.println("*********************************");

	  }
	}
class Css extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("css Programming Language");
	    System.out.println("*********************************");

	  }
	}
class Main {
	  public static void main(String[] args) {
		  System.out.println("Le polymorphisme en Java fait référence"
					+ " à la capacité d'une classe à prendre plusieurs formes");
	    // create an object of Java class
	    Java j1 = new Java();
	    j1.displayInfo();

	    // create an object of Language class
	    Language l1 = new python();
	    l1.displayInfo();
	    Language l12 = new Php();
	    l12.displayInfo();
	    
	    Language l13 = new JavaScript();
	    l13.displayInfo();
	    
	    Language l14 = new Css();
	    l14.displayInfo();
	    
	    

	    
	    
	    
	  }
	}