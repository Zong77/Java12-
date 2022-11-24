package Java12;

class CRectangle {
	int width;
	int height;
}

public class Class01 {

	public static void main(String[] args) {
		CRectangle rectl;
		rectl = new CRectangle();
		rectl.width = 10;
		rectl.height = 5;
		System.out.println("width=" + rectl.width);
		System.out.println("height=" + rectl.height);
	}
}