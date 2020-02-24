package g;

public class Test1 {
	public static void main(String[] args) {
		IAnimal animal = new Dog();
		animal.bark();
		System.out.println("/////////////////////////////");
		if(animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.bark();
		}
		else 
			System.out.println("不是cat类对象");
	}
	
}
