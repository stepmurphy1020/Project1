package Statlib;

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
