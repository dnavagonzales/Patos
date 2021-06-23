public class RubberDuck extends Duck{
	@Override
	public void quack() {
		System.out.println("<<Squeak>>");
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck..");
	}

	@Override
	public void fly() {
		System.out.println("Para que no vuele sobrescribimos el metodo volar para que no realice nada");
	}
}
