
public class Square extends Shape{
	//constructor
	public Square (double s) {
		area = s * s;
	}
	public void getArea() {
		System.out.println("Square's area = " +area);
	}
}
