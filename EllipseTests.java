package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import ShapeClasses.MyEllipse;

public class EllipseTests {

	@Test
	public void getsAreaPass() {
		//Pass Test
		MyEllipse ellipse = new MyEllipse(30.0, 20.0);
		Double area = ellipse.getArea();
		area = Math.round(area * 100d) / 100d;
		assertEquals(Double.valueOf(1884.96), area);
	}
	
	@Test
	public void getsAreaFail() {
		//Fail Test
		MyEllipse ellipse = new MyEllipse(35.0, 22.0);
		Double area = ellipse.getArea();
		area = Math.round(area * 100d) / 100d;
		
		assertEquals(Double.valueOf(1884.96), area);
	}
	
	@Test
	public void getsPerimeterPass() {
		//Pass Test
		MyEllipse ellipse = new MyEllipse(30.0, 20.0);
		Double perim = ellipse.getPerimeter();
		perim  = Math.round(perim * 100d) / 100d;
		//The answer should be 158.65
		assertEquals(Double.valueOf(158.65), perim);
	}
	
	@Test
	public void getsPerimeterFail(){
		//FailTest
		MyEllipse ellipse = new MyEllipse(35.0, 22.0);
		Double perim = ellipse.getPerimeter();
		perim  = Math.round(perim * 100d) / 100d;
		assertEquals(Double.valueOf(158.65), perim);
	}

}
