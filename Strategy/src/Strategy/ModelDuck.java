package Strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model Duck!");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

}
