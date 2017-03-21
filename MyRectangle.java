package ShapeClasses;

public class MyRectangle implements Shape {
	private Double height;
	private Double width;
	
	public MyRectangle(Double height, Double width){
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		Double area = 0.0;
		area = height * width;
		return area;
	}

	@Override
	public double getPerimeter() {
		Double perimeter = 0.0;
		perimeter = height + height + width + width;
		return perimeter;
	}

}
