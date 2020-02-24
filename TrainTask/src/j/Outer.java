package j;

public class Outer {
	static String str="Outer";
	static class In{
		String str="In";
		public void show() {
			System.out.println(Outer.str);
			System.out.println(str);
		} 
	}
	
}

//创建一个包含内部类的类，外部类中定义一个名为str的String字符串并初始化任意值
//，在内部类中定义,跟外部类同种类型且同名的变量，并在内部类中定义一个方法，分别打印外部类和内部类的变量。