package JUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ShapeClasses.*;



public class CircleTests {

	@Test
	public void getsAreaPass() {
		//Pass Test
		MyCircle circle = new MyCircle(10.0);
		Double area = circle.getArea();
		area = Math.round(area * 100d) / 100d;
		assertEquals(Double.valueOf(314.16), area);
	}
	
	@Test
	public void getsAreaFail() {
		//Fail Test
		MyCircle circle = new MyCircle(16.0);
		Double area = circle.getArea();
		//area should be 804.25
		assertEquals(Double.valueOf(314.16), area);
	}
	
	@Test
	public void getsPerimeterPass() {
		//Pass Test
		MyCircle circle = new MyCircle(10.0);
		Double perim = circle.getPerimeter();
		perim = Math.round(perim * 100d) / 100d;
		assertEquals(Double.valueOf(62.83), perim);
	}
	
	@Test
	public void getsPerimeterFail() {
		//Fail Test
		MyCircle circle = new MyCircle(16.0);
		Double perim = circle.getPerimeter();
		//perimeter should be 100.53
		assertEquals(Double.valueOf(62.83), perim);
	}

}
