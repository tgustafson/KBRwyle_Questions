package ShapeClasses;

public class MyEllipse implements Shape{
	private Double axisA;
	private Double axisB;
	
	public MyEllipse(Double axisA, Double axisB){
		this.axisA = axisA;
		this.axisB = axisB;
	}
	
	@Override
	public double getArea() {
		Double area = 0.0;
		area = Math.PI * axisA * axisB;
		return area;
	}

	//for the ellipse this is a approximation. I am using Ramanujan's equation
	//	p = PI (axisA + axisB) ( 1 + 3h / (10 + √ 4 - 3h))
	//    where h = (axisA - axisB)^2 / (axisA + axisB)^2
	//I am simplifying my answer
	@Override
	public double getPerimeter() {
		Double perim = 0.0;
		
		Double h = ((axisA - axisB) * (axisA - axisB)) / ((axisA + axisB) * (axisA + axisB));
		
		perim = Math.PI * (axisA + axisB) * (1 + ((3 * h) / (10 + Math.sqrt(4 - (3 * h)))));
		return perim;
	}

}
