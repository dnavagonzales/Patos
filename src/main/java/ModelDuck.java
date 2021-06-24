public class ModelDuck extends Duck{
	@Override
	public void display() {
		System.out.println("I am a model o a Duck");
	}

	public ModelDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Quak());
	}
}
