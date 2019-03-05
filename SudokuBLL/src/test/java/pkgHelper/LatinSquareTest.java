package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test() {
		
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void hasDuplicates1() {
		
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		
		
		assertEquals(bExpected, bActual);
		
		int bExpectedCompare = Arrays.compare(arr1, arr2);
		
		System.out.print
	}
}


