package Statlib;


public class Main
{
    public static void main(String[]args){
    	/*double[] array = {10,10,10,45,45,45,50,99,44,44};
    	
    	mean avg = new mean();
    	System.out.println("Mean:"+avg.mean(array));
    	
    	permutations perm = new permutations();
    	mode m = new mode();
    	
    	System.out.println("Mode:"+m.mode(array));
    	med med = new med();
    	
    	System.out.println("Median:"+med.median(array));
    	
    	System.out.println("Permutation:"+perm.perm(52,2));
    	
    	combinations comb = new combinations();
    	System.out.println("Combination:"+comb.comb(12,2));
    	
    	Variance V = new Variance();
    	System.out.println("Variance:"+V.var(array));
    	
    	StdDev sd = new StdDev();
    	System.out.println("Standard Deviation:"+sd.SD(array));*/
    	
    	DistFac fac = new DistFac();
    	System.out.println(fac.DistFac1(52, 49));
    	System.out.println(fac.DistFac1(49, 52));
    	
    	Binomial B = new Binomial();
    	System.out.println(B.Binomial1(12, .3, .7, 2));
    }
}