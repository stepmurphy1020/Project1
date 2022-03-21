package Statlib;
/**
* Takes 4 variables N,n,r,y. Where N = total # of people/things, n is how many people we want to pull,  r is total amount 
* of the selection group we want, and y is the amount of successes out of n.
* 
* 
* @author Stephen Murphy
*
*/
public class Hypergeometric {
	public double Hyper(double N, double n, double r, double y) {
		combinations C = new combinations();
		double a = C.comb(r, y);
		double q = N-r;
		double w = n-y;
		double b = C.comb(q, w);
		double e = C.comb(N, n);
		return (a*b)/e;
	}
}
