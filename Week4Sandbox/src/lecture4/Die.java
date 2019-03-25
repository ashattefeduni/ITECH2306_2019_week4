package lecture4;

public class Die {

	public void throwASix() {
		int dieValue = 0;
		// loop until throwing the Die gets a six
		do {
			// generate a random number in the range 0.0 to 1.0
			double randomNumber = Math.random();
			// to get a number in the range 1 to 6, we need to multiply the
			// random number by 6 and add 1
			randomNumber *= 6;
			randomNumber++;
			// to convert this value into an integer we cast it
			dieValue = (int) randomNumber;
			System.out.println("You have thrown a " + dieValue);
		} while (dieValue != 6);

	}

}
