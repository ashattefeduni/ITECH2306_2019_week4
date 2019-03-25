package lecture4;

public class AnimalFarm {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Dog");
		
		//a.makeSound();
		
		Dog d = new Dog();
		
		
		//System.out.println(d.toString());
		
		//d.makeSound();
		
		
		Cat c = new Cat();
		
		//c.makeSound();
		
		
		Animal[] animalArray = { d, c };
		
		for (Animal animal : animalArray) {
			animal.makeSound();
		}
	}

}
