package Strategy;

public final class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm a flying with a Rocket!");
	}

}
