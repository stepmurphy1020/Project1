package Statlib;
/**
* Takes the geometric distribution of 3 variables where p is the probability of success.
* q is 1-p, which is the chance of failure
* y is the number of trials it takes to be successful as in "What is the probability to succeed by the y-th trial."
* 
* 
* @author Stephen Murphy
*
*/
public class Geometric {
	public double Geo(double p, double q, double y) {
		double j = Math.pow(q, y-1); //q to the power of y-1
		return (j*p); 
	}
}
