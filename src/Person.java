
public class Person {
	  	float height;
		float weight;
		
		// Constructor
		public Person() {
			this.height = 6;
			this.weight = 200;
		}
		
		public void Walks() {
			this.weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("You weight: " + this.weight + " lbs");
		}
		
		public void Eats() {
			this.weight *= 1.2;
			System.out.println("You gained weight!");
			System.out.println("You weight: " + this.weight + " lbs");
		}
}