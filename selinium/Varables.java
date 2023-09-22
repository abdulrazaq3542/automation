package selinium;

public class Varables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 cat mycat = new cat();  // Create a Pig object
		    mycat.animalSound();
		    mycat.sleep();

	}

}
interface Animal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	class cat implements Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The cat says: meow");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	}
