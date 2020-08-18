package p39.DecoratorPattern;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck ITDuck = new InterfaceDuck();
		
		ITDuck.performFly();
		ITDuck.performQuack();
	}

}
