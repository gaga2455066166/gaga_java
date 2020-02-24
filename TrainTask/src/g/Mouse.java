package g;

public class Mouse implements UsbDevice{
	public void on() {
		System.out.println("Mouse_On");
	}
	public void off() {
		System.out.println("Mouse_Off");
	}
}
