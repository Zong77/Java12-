package Java12;

class CCircle {
	private double pi = 3.14;
	private double raduis;

	public CCircle(double r) {
		raduis = r;
	}

	public void show() {
		System.out.println("radius=" + raduis + ", area=" + pi * raduis * raduis);
	}
}

public class Class02 {

	public static void main(String[] args) {
		CCircle cirl = new CCircle(4.0);
		cirl.show();
	}
}