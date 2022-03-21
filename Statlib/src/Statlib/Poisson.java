package Statlib;
/**
* K,n,y. K = Total number of events, n = number of units in the data, y = number of trials.
* 
* 
* @author Stephen Murphy
*
*/
public class Poisson {
	public double pois(double K, double n, double y) {
		Factorial fac = new Factorial();
		double l = (K/n); 
		double a = fac.fac(y);
		double b = Math.pow(l, y);
		double e = Math.exp(-l);
		return (b/a)*e;
		
	}
}
