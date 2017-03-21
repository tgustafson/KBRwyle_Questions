package ShapeClasses;

public class MyTriangle implements Shape{
	private Double sideA;
	private Double sideB;
	private Double sideC;
	
	public MyTriangle(Double sideA, Double sideB, Double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	//Find are using Heron's Formula [ Area	= √	 p(	p −	a)(	p − b)( p −	c) ]
	//where p = half the perimeter
	@Override
	public double getArea() {
		Double area = 0.0;
		Double perHalf = this.getPerimeter() / 2;
		area = perHalf * (perHalf - sideA) * (perHalf - sideB) * (perHalf - sideC);
		area = Math.sqrt(area);
		return area;
	}

	@Override
	public double getPerimeter() {
		Double perimeter = sideA + sideB + sideC;
		return perimeter;
	}
}
