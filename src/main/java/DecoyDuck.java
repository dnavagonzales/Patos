public class DecoyDuck extends Duck{
	@Override
	public void display() {
		System.out.println("I am a duck of wood Decoy Duck. I can:");
	}

	public DecoyDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new MuteQuack());
	}
}
