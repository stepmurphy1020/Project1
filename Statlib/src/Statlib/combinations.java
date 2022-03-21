package Statlib;
/**
*
* 
* 
* @author Stephen Murphy
*
*/
public class combinations
{
  public double comb(double n,double r ){
	  DistFac dfac = new DistFac();
		Factorial fac = new Factorial();
		double f = dfac.DistFac1(n, r);
		double g = 1/(fac.fac(n-r));
		return (f*g);
    }
}
