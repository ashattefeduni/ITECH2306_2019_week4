package lecture4;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}
	
	@Override
	public void makeSound() {
		//super.makeSound();
		System.out.println("Woof woof!");
	}

}
