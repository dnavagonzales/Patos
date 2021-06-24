public class Main {
	public static void main(String[] args) {
		DecoyDuck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.performQuack();
		decoyDuck.performFly();
		decoyDuck.swim();
		System.out.println("----------------------------------");
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		rubberDuck.swim();
		System.out.println("----------------------------------");
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.swim();


	}

}
