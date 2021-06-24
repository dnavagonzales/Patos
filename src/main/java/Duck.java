public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public void swim(){
		System.out.println("swim");
	}

	public abstract void display();

//Here we delegate that behavior to the object referenced by quackBehavior
	public void performQuack(){
		quackBehaviour.quack();
	}
	public void performFly(){
		flyBehaviour.fly();
	}
}
