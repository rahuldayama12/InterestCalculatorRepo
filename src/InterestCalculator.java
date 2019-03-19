/**
 *THIS APPLICATION WILL CALCULATE THE SIMPLE INTEREST AND COMPOUND INTEREST
 * @author Rahul Dayama
 */
import java.lang.Math;
public class InterestCalculator
{
	//Calculate simple interest
	public double simpleInterest(int principle,int time,double rateOfInterest)
	{
		return (principle*time*rateOfInterest)/100;
	}
	//Calculate compound interest
	public double compoundInterest(int principle,int time,double rateOfInterest)
	{
		return principle*(Math.pow((1+rateOfInterest/100),time));
	}
}