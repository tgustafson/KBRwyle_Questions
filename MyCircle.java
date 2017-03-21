package ShapeClasses;

public class MyCircle implements Shape{
	private Double radius;
	
	public MyCircle(Double radius){
		this.radius = radius;
	}

	@Override
	public double getArea() {
		Double area = 0.0;
		area = Math.PI * (radius * radius);
		return area;
	}

	@Override
	public double getPerimeter() {
		Double perimeter = 0.0;
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}
