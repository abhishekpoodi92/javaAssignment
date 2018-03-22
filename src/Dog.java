
public class Dog extends Animal{

	   public void eat(){
	      System.out.println("Dog is eating");
	   }
	   
	   public static void main(String args[]) {
	      Animal obj = new Dog();
	     
	      obj.eat();
	   }

}
