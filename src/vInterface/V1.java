package vInterface;


 class Ver  implements Enemy
{
   
   public void moveTo()
   {
      System.out.println("Achref runs towards the player.");
   }
   public void attack()
   {
      System.out.println("Achref attacks the player.");
   }
   public void heal()
   {
      System.out.println("Achref heals itself with a potion.");
   }
   public void throwRock()
   {
      System.out.println("Achref throws a rock at the enemy.");
   }
   public void eventOnDeath()
   {
      System.out.println("Achref falls apart and drops an item.");
   }
@Override
public void breathe() {
    System.out.println("Achref breath.");
	
}
@Override
public void speak() {
    System.out.println("Achref Speak at the player.");
	
}
 
 
	
}
interface Enemy
{
	public void breathe();

   public void speak();
   public void moveTo();
   public void attack();
   public void heal();
   public void eventOnDeath();
}

public class V1 {
	
	

	public static void main(String[] args) {
		
		
		Ver humain=new Ver();
		humain.attack();
		humain.speak();
		humain.eventOnDeath();
		humain.heal();
	}

}
