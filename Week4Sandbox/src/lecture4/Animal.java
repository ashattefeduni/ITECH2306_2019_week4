package lecture4;

public class Animal {
	
	private String species;
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void makeSound() {
		System.out.println("Default animal noises");
	}
	
	@Override
	public String toString() {
		return this.species;
	}

}
