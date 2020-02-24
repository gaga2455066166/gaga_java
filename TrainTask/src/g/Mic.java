package g;

public class Mic implements UsbDevice{
	public void on() {
		System.out.println("Mic_On");
	}
	public void off() {
		System.out.println("Mic_Off");
	}
}
