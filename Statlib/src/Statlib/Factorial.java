package Statlib;


public class Factorial
{
  public double fac(double f){
    if(f==0)
    return 1;
    else
    return(f*fac(f-1));
  }
  
 }