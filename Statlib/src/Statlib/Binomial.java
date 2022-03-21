package Statlib;
/**
 * n,p,q,y. n is number of trials, p is probability of success, q = 1-p, y = number of successes
 * 
 * 
 * @author Stephen Murphy Jr
 *
 */
public class Binomial {
	public double Binomial1(double n, double p, double q, double y) { //Formula (Comb(n y)*p^y*q^(n-y))
		combinations C = new combinations();
		double c = C.comb(n, y); //combinations formula
		double j = Math.pow(p,y);
		double k = (n-y);
		double l = Math.pow(q, k);
		return (c*j*l);
	}
}
