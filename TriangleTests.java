package JUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ShapeClasses.*;

public class TriangleTests {

	@Test
	public void getsAreaPass() {
		//Pass Test
		MyTriangle triangle = new MyTriangle(30.0, 20.0, 18.0);
		Double area = triangle.getArea();
		area = Math.round(area * 10000d) / 10000d;
		assertEquals(Double.valueOf(174.5394), area);
	}
	
	@Test
	public void getsAreaFail() {
		//Fail Test
		MyTriangle triangle = new MyTriangle(35.0, 22.0, 15.0);
		Double area = triangle.getArea();
		area = Math.round(area * 10000d) / 10000d;
		//area should be 102.8786
		assertEquals(Double.valueOf(174.5394), area);
	}
	
	@Test
	public void getsPerimeterPass() {
		//Pass Test
		MyTriangle triangle = new MyTriangle(30.0, 20.0, 18.0);
		Double perim = triangle.getPerimeter();
		assertEquals(Double.valueOf(68.0), perim);
	}
	
	@Test
	public void getsPerimeterFail(){
		//FailTest
		MyTriangle triangle = new MyTriangle(35.0, 22.0, 15.0);
		Double perim = triangle.getPerimeter();
		//perimeter should be 72
		assertEquals(Double.valueOf(68.0), perim);
	}

}
