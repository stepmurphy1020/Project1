package Statlib;
/**
 * This factorial class was made specifically in mind to make the computations smaller.
 * This is so the program does not return NaN or 1.0 when the factorial gets to be too large.
 * 
 * @author Stephen Murphy
 *
 */
public class DistFac {
	private double dfac = 1;
	public double DistFac1(double n,double r) {
		double q = Math.abs(n-r);//number of times the largest number has to be ticked down
		for(double i = 0; i <= q-1; i++) {
			 double a = (n-i);
			 dfac = dfac*a;
			 //System.out.println(a);
			 //System.out.println(b);
			 //System.out.println(dfac);
		}
		return dfac;
	}
}
