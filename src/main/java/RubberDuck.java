public class RubberDuck extends Duck {
	public RubberDuck() {
		setQuackBehaviour(new Squeak());
		setFlyBehaviour(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck. I can:");
	}

}
