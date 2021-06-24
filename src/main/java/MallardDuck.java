public class MallardDuck extends Duck {
	@Override
	public void display() {
		System.out.println("I am a Mallard Duck. I can:");
	}

	public MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quak());
	}
}
