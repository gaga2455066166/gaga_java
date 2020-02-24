package e;

public class SubCar extends Car {
	int price;
	int speed;

	public void speedChange(int speed) {
		this.speed = speed;
		System.out.println("speed已经成功改变为：" + this.speed);
	}

	public void showSpeed() {
		System.out.println(mark + "车的速度为：" + speed);
	}

	public void showPrice() {
		System.out.println(mark + "车的价格为：" + price);
	}
}
