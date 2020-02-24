package h;

//外部类
public class Outer {
	void showOuter() {
		System.out.println("show outer");
	}

	int o = 1;

	void showInnerMath() {
		System.out.println("showInnerMath:");
		Inner in = new Inner();
		in.showInner();
	}

	void showInnerVar() {
		System.out.println("showInnerVar:");
		Inner in = new Inner();
		System.out.println(in.i);
	}

	// 内部类
	static class Inner {
		void showInner() {
			System.out.println("show inner");
		}

		int i = 0;

//		void showOutMath() {
//			System.out.println("showOutMath:");
//			showOuter();
//		}

//		void showOutVar() {
//			System.out.println("showOutVar:");
//			System.out.println(o);
//		}
	}
}
