package h;

import h.Outer.Inner;

public class TestOuter {
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.showOuter();
		System.out.println(ou.o);
		ou.showInnerMath();
		ou.showInnerVar();
		System.out.println("---------------------");
		Outer.Inner ouin = new Outer.Inner();
		ouin.showInner();
		System.out.println(ouin.i);
		
		System.out.println("-------------------------");
		Inner in=new Inner();
		in.showInner();
		
		System.out.println("--------------------------");
		show(new Animal() {
			
			@Override
			public void show() {
				// TODO 自动生成的方法存根
				System.out.println("animal show");
			}
		});
		
		
	}
	public static void show(Animal animal) {
		animal.show();
	}
}
