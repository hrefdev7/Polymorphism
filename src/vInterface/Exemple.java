package vInterface;

public class Exemple {
	
	 
		   public static void main(String[] args) {
			   //on utilise le polymorphisme 
			//   creer un objet dog a partir de la class animal
			 
		       Animal dog = new Dog();
		       Animal cat = new Cat();
		       
		       dog.swim();
		       dog.play();
		       cat.swim();
		       cat.play();

		   }
		}

		interface Swimmer {
		   void swim();
		}

		interface Player {
		   void play();
		}

		//implement the Swimmer and the Player interfaces
		abstract class Animal implements Swimmer,Player{
			/*
			 * Avec java on peut herité d'une seule class
			 * Alors que la classe en java peut immplementer plusieurs interface
			 */
		  public abstract void play();
		  public abstract void swim();
		}


		class Dog extends Animal {
		    //Override the swim() and the play() methods
		    public void swim(){
		        System.out.println("Dog is swimming");
		    }
		    
		    public void play(){
		        System.out.println("Dog is playing");
		    }
		    
		   }


		class Cat extends Animal{
		    //Override the swim() and the play() methods
		    public void swim(){
		        System.out.println("Cat is swimming");
		    }
		    
		    public void play(){
		        System.out.println("Cat is playing");
		    }
		    
		   
		

}
