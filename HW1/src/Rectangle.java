
public class Rectangle {
	
	private static double length;
	private static double width;
	
	public Rectangle(){
		length = 0.0;
		width = 0.0;
	}
	
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	public static double getPerimeter(){
		return (length * 2) + (width * 2);
	}
	
	public static double getArea(){
		return (length * width);
	}

	public static void displayPerimeter(){
		System.out.println(getPerimeter());
	}
	
	public static void displayArea(){
		System.out.println(getArea());
	}

}
