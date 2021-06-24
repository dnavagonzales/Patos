public class Main {
	public static void main(String[] args) {
		DecoyDuck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.swim();
		System.out.println("----------------------------------");
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.swim();
		//rubberDuck.quack();
		System.out.println("----------------------------------");
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		//mallardDuck.fly();
		//mallardDuck.quack();
		mallardDuck.swim();


	}

}
