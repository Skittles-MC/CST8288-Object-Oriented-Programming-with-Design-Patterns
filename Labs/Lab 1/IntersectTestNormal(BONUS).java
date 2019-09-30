package utility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.BeforeEach;

import utility.IntersectUtil;

/**
 * File Name:       	IntersectTesstNormal.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8288 Object Oriented Programming with Design Patterns
 * Lab:      			1
 * Assignment Title:	Lab - Junit 5 Testing
 * Due Date:        	Sunday, Sept 29, 11:59PM 2019
 * Submission Date:		Sunday, Sept 29, 7:55PM	 2019
 */
class IntersectTestNormal{

	private boolean doesIntersect;
	private double[] intersect;

	@BeforeEach
	void setUp() throws Exception{
		intersect = new double[4];
	}
		//intersect array is used as buffer for result. we pass it as argument to prevent remake of array.
		//instead use the same array over and over again.
		//call assertTrue if doesIntersect is expected to be true or assertFalse if expected to be false
		//user assertEquals to compare indexes 0, 1 and 2 to expected data in the pdf or csv.
		//make sure to use assertEquals that takes delta as third argument when comparing double.
		//intersect[0] is px which is the x of intersect point
		//intersect[1] is py which is the y of intersect point
		//intersect[2] is ray scalar which is the scaler distance of ray to segment line.
		//ray is the first 4 numbers and segment is the next 4 numbers.
		//ray has starting point and end point is just direction the length of ray is infinite from start toward end.
		//segment start and end are set and length of it is limited to what is given.
	@ParameterizedTest
	@CsvFileSource(resources = "/resources/data.csv", numLinesToSkip = 2) //skip 2 rows/start on where data set starts
	  public void testABAD(double rsx, double rsy, double rex, double rey, double ssx, double ssy, double sex, double sey) {
	    doesIntersect = IntersectUtil.getIntersection(intersect, rsx, rsy, rex, rey, ssx, ssy, sex, sey);

	    if (doesIntersect) {
	      
	      System.out.print("|Px:  " + intersect[0] + "|");
	      System.out.print("|\t|Py:  " + intersect[1]);
	      System.out.print("|\t|Ray Scalar: " + intersect[2] + "|");
	      System.out.print("|\tTRUE\t|");
	      System.out.println();

	    }else {
	      System.out.print("|Px:  " + 0 + "|");
	      System.out.print("|\t|Py:  " + 0);
	      System.out.print("|\t|Ray Scalar: " + 0 + "|");
	      System.out.print("|\t|FALSE\t|");
	      System.out.println();
	    }
	  }
	}
		
	

