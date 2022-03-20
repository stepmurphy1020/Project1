package Statlib;

public class Hypergeometric {
	public double Hyper(double N, double n, double r, double y) {
		combinations C = new combinations();
		double a = C.comb(r, y);
		double b = C.comb((N-r), (n-y));
		double e = C.comb(N, n);
		return (a*b)/e;
	}
}
