

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitTest
{
	@Test
	public void testIsEvenFalse()
	{
		double expectedResult = (12520 * Math.pow((1+.05),1));
		double realResult = tuitionMain.futureValueCalculator(12520,.05,1);
		assertEquals("testIsEvenFalse() failed",expectedResult,realResult,.04);
	}
}
