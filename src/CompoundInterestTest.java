import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void compoundinteresttest()
	{
		InterestCalculator ic=new InterestCalculator();
		double result=ic.compoundInterest(1000,4,10);
		assertEquals(1464.1,result,0.1);
	}

}
