package p39.DecoratorPattern;

public class InterfaceDuck extends Duck {

	public InterfaceDuck() {
		flyBehavior = new FlyWithRocket();
		quackBehvior = new Quack();
	}
	
	public void display() {
		System.out.println("인터페이스 오리 생성.");
	}
	
}
