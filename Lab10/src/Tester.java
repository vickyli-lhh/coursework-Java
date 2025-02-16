import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogA = new Dog("Ruka", 0, "Shiba");
		Dog dogB = new Dog("Maya", 1, "Samoyed");
		Dog dogC = new Dog("Happy", 1, "Dachshund");
		Bird birdA = new Bird("Kiwi", 0, false);
		Bird birdB = new Bird("Chuchu", 1, true);
		Bird birdC = new Bird("Tasty", 1, false);
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dogA);
		dogList.add(dogB);
		dogList.add(dogC);
		ArrayList<Bird> birdList = new ArrayList<Bird>();
		birdList.add(birdA);
		birdList.add(birdB);
		birdList.add(birdC);
		System.out.println("Doggies names:");
		for (Dog dog : dogList) {
			System.out.print(dog.getName() + " ");
		}
		System.out.printf("%n%14s%n", "Birdies names:");
		for (Bird bird : birdList) {
			System.out.print(bird.getName() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Comparison of dogA & birdA's breathe result:");

		dogA.breathe();
		birdA.breathe();
		System.out.println();
	
		System.out.println("Make all the dogs run and bark:");
		for (Dog dog : dogList) {
			dog.run();
			dog.bark();
		}
		System.out.println();
	
		System.out.println("Make all the bird fly:");
		for (Bird bird : birdList) {
			bird.fly();
		}
		System.out.println();
		
		System.out.println("All the dog breeds:");
		for (Dog dog : dogList) {
			System.out.print(dog.getBreed() + " ");
		}
		System.out.println();
		System.out.println("All the dog breeds:");
		for (Bird bird : birdList) {
			if (!(bird.getFlyable())) {
				System.out.print(bird.getName() + " ");
			}

		}
	}
}
