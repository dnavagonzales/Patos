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
		System.out.println("--------Here We declare abstract class but instances de concrete class--------------------------");
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		System.out.println("Now I can Fly: ");
		model.performFly();

	}

}
