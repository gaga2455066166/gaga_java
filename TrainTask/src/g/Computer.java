package g;

public class Computer {
	UsbDevice[] usb = new UsbDevice[4];
	int i=0;
	
	public void computeron() {
		for(int s=0;s<i;s++) {
			usb[s].on();
		}
		System.out.println("����usb�ӿ��豸������������������");
	}
	public void computeroff() {
		for(int s=0;s<i;s++) {
			usb[s].off();
		}
		System.out.println("����usb�ӿ��豸���ѹرգ����Թر�");
	}
	public void addUsbDevice(UsbDevice usbDevice) {
		usb[i]=usbDevice;
		i++;
	}
}
