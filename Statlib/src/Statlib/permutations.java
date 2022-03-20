package Statlib;

public class permutations
{
    public double perm(double n,double r){
    Factorial f = new Factorial();
    double q = f.fac(n);
    double l = (n-r);
    double p= f.fac((l));
    return q/p; 
    }
}