package e;

public class SubCar extends Car {
	int price;
	int speed;

	public void speedChange(int speed) {
		this.speed = speed;
		System.out.println("speed�Ѿ��ɹ��ı�Ϊ��" + this.speed);
	}

	public void showSpeed() {
		System.out.println(mark + "�����ٶ�Ϊ��" + speed);
	}

	public void showPrice() {
		System.out.println(mark + "���ļ۸�Ϊ��" + price);
	}
}
