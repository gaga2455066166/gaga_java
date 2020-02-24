package b;

public class Test {
	public static void main(String[] args) {
		Square s= new Square();
		s.a=3;
		s.area();
		IAnimal f=new Fish();
		IAnimal b= new Bird();
		run(f);
		run(b);
		System.out.println("----------------");
		Dog d=new Dog();
		Animal c=new Cat();
		
		eat(c);
		
		System.out.println("------------------");
		d.eat();
		d.run();
	}
	public static void run(IAnimal a) {
		a.run();
	}
	public static void eat(Animal a) {
		a.eat();
	}
}
