package g;

public class Computer {
	UsbDevice[] usb = new UsbDevice[4];
	int i=0;
	
	public void computeron() {
		for(int s=0;s<i;s++) {
			usb[s].on();
		}
		System.out.println("所有usb接口设备都已启动，电脑启动");
	}
	public void computeroff() {
		for(int s=0;s<i;s++) {
			usb[s].off();
		}
		System.out.println("所有usb接口设备都已关闭，电脑关闭");
	}
	public void addUsbDevice(UsbDevice usbDevice) {
		usb[i]=usbDevice;
		i++;
	}
}
