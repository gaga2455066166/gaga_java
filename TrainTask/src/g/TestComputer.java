package g;

public class TestComputer {
	public static void main(String[] args) {
		UsbDevice mouse = new Mouse();
		UsbDevice mic = new Mic();
		UsbDevice keyboard = new Keyboard();
		Computer computer = new Computer();
		computer.addUsbDevice(mouse);
		computer.addUsbDevice(mic);
		computer.addUsbDevice(keyboard);
		
		
		
		computer.computeron();
		System.out.println("\n----------------电脑运行中-----------------\n");
		computer.computeroff();
	}
}
