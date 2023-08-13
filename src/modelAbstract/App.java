package modelAbstract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
			List<Language> lbk=new ArrayList<Language>();

	    // create an object of Java class
	    Java j1 = new Java();
	    j1.displayInfo();
lbk.add(j1);
	    // create an object of Language class
	    Language l1 = new python();
	    lbk.add(l1);
	    l1.displayInfo();
	    Language l12 = new Php();
	    l12.displayInfo();
	    lbk.add(l12);
	    Language l13 = new JavaScript();
	    l13.displayInfo();
	    lbk.add(l13);
	    Language l14 = new Css();
	    l14.displayInfo();
	    lbk.add(l14);
for(Language l:lbk) {
	    


	    
	    
	    
	  }
	}}