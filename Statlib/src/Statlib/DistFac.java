package Statlib;

public class DistFac {
	public double DistFac1(double n,double r) {
		double q = Math.abs(n-r);
		if(q==0)
		return 1;
		else
		return(q*DistFac1(q-1,0));
	}
}
