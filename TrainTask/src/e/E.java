package e;

public class E {
	public static void main(String[] args) {
		SubCar aodi = new SubCar();
		SubCar benchi = new SubCar();
		aodi.mark = "°ÂµÏ";
		aodi.price = 50;
		aodi.speed = 80;
		aodi.showMark();
		aodi.showPrice();
		aodi.showSpeed();
		aodi.drive();
		aodi.speedChange(120);
		aodi.showSpeed();
		System.out.println();
		benchi.mark = "±¼³Û";
		benchi.price = 100;
		benchi.speed = 90;
		benchi.showMark();
		benchi.showPrice();
		benchi.showSpeed();
		benchi.drive();
		benchi.speedChange(120);
		benchi.showSpeed();
	}
}
