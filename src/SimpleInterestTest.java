import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	@Test
	public void simpleInteresttest()
	{
		InterestCalculator ic=new InterestCalculator();
		double result=ic.simpleInterest(1000,5,10);
		assertEquals(500.0,result,0.1);
	}

}
