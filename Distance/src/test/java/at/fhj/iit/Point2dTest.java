package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class Point2dTest {

	/**
	 * Set some Point2d for testing their functionality
	 */

	Point2d p2d1 = new Point2d();
	Point2d p2d2 = new Point2d(2.2,1.1);

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p2d1.setX(2.3);
		assertEquals(2.3,p2d1.getX(),0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p2d1.setY(-3.2);
		assertEquals(-3.2,p2d1.getY(),0.001);
	}


	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){

		p2d1.setX(1);
		p2d1.setY(2);
		assertEquals(1.5, p2d1.distanceFrom(p2d2), 0.001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		p2d1.setX(1);
		p2d1.setY(4.1);
		assertEquals(4.22, p2d1.distanceFromOrigin(), 0.001);
	}
}
