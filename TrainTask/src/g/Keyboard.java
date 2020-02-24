package g;

public class Keyboard implements UsbDevice{
	public void on() {
		System.out.println("Keyboard_On");
	}
	public void off() {
		System.out.println("Keyboard_Off");
	}
}
