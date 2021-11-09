 import java.util.Scanner;

  /**
   * A simple class to run the Magpie class.
   * @author Laurie White
   * @version April 2012
   */
  public class Main
  {

     /**
	  * Create a Magpie, give it user input, and print its replies.
  	  */
	 public static void main(String[] args)
	 {
	    Magpie maggie = new Magpie();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
    statement = statement.toLowerCase();

		while (!statement.equals("bye"))
		{
      while (maggie.checkStringIsEmpty(statement)) {
        int random = (int) (Math.random()*2);
        if (random == 0) {
          System.out.println("Hmmm? Did you say something");
        } else {
          System.out.println("Say something, please.");
        }
        statement = in.nextLine();
        statement = statement.toLowerCase();
      }
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
      statement = statement.toLowerCase();
		}
    System.out.println("Goodbye!");
    in.close();
	 }
  }