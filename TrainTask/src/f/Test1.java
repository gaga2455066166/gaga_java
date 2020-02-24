package f;

public class Test1 {
	public static void main(String[] args) {
		Animal a= new Dog();
		Animal b= new Cat();
		Animal c= new Serpent();
		bark(a);
		bark(b);
		bark(c);
		
	}
	public static void bark(Animal a) {
		a.bark();
	}
}
