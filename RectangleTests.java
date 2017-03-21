package JUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ShapeClasses.*;

public class RectangleTests {

	@Test
	public void getsAreaPass() {
		//Pass test
		MyRectangle rectangle = new MyRectangle(25.0, 14.0);
		Double area = rectangle.getArea();
		assertEquals(Double.valueOf(350.0), area);
	}
	
	@Test
	public void getsAreaFail() {
		//Fail Test
		MyRectangle rectangle = new MyRectangle(20.0, 18.0);
		Double area = rectangle.getArea();
		//area should be 360
		assertEquals(Double.valueOf(350.0), area);
	}
	
	@Test
	public void getsPerimeterPass() {
		//Pass test
		MyRectangle rectangle = new MyRectangle(25.0, 14.0);
		Double perim = rectangle.getPerimeter();
		
		assertEquals(Double.valueOf(78.0), perim);
	}
	
	@Test
	public void getsPerimeterFail() {
		//Fail test
		MyRectangle rectangle = new MyRectangle(29.0, 19.0);
		Double perim = rectangle.getPerimeter();
		//perimeter should be 96
		assertEquals(Double.valueOf(78.0), perim);
	}

}
