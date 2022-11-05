import java.util.Random;

public class Dice1{

   private Random randGen = new Random ( );

   public Dice1 ( ) {

   }

   public int nextRoll( ) {
      // You supply this code.
      return -1;
   }


   public void tester (int howMany) {
	  int k = 0;
	  while (k < howMany) {
	     System.out.println (nextRoll());
	     k = k + 1;
	  }
   }
   
  
}
