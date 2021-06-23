public class RedheadDuck extends Duck implements Quackable,Flyable{
	@Override
	public void display() {
		System.out.println("I am a Readhead Duck!!");
	}

	@Override
	public void quack() {
		System.out.println("Quak, Quak, Quak !!");
	}

	@Override
	public void fly() {
		System.out.println("Fly, Fly, Fly !!");
	}
}
