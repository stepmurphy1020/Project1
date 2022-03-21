package Statlib;
/**
 * This factorial class was made specifically in mind to make the computations smaller.
 * This is so the program does not return NaN or 1.0 when the factorial gets to be too large.
 * 
 * @author Stephen Murphy
 *
 */
public class DistFac {
	public double DistFac1(double n,double r) {
		double q = Math.abs(n-r);
		if(q==0)
		return 1;
		else
		return(q*DistFac1(q-1,0));
	}
}
