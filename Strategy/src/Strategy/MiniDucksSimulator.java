/*The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.

“We’re using the strategy pattern to implement
the various behaviors of our ducks.”
This tells you the duck behavior has been
encapsulated into its own set of classes
that can be easily expanded and changed,
even at runtime if needed.
*/

package Strategy;

public class MiniDucksSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
