public class MallardDuck extends Duck implements Quackable, Flyable{
	@Override
	public void display() {
		System.out.println("I am a Mallard Duck");
	}

	@Override
	public void fly() {
		System.out.println("Fly, Fly, Fly !!!");
	}

	@Override
	public void quack() {
		System.out.println("Quack, Quack, Quack !!");
	}
}
