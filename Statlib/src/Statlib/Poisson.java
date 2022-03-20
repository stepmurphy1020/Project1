package Statlib;

public class Poisson {
	public double pois(double K, double n, double y) {
		Factorial fac = new Factorial();
		double l = (K/n); 
		double a = fac.fac(y);
		double b = Math.pow(l, y);
		double e = Math.exp(-a);
		return (b/a)*e;
		
	}
}
