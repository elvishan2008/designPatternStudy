package p39.DecoratorPattern;

public abstract class Duck{
	FlyBehavior flyBehavior;
	QuackBehvior quackBehvior;
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehvior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehvior(QuackBehvior quackBehvior) {
		this.quackBehvior = quackBehvior;
	}
	
}
