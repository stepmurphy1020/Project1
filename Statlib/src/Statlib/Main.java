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
    	
    	Binomial B = new Binomial();
    	System.out.println("Binomial:");
    	System.out.println(B.Binomial1(12, .3, .7, 2)+ "\n");
    	
    	Poisson P = new Poisson();
    	System.out.println("Poisson:");
    	System.out.println(P.pois(4, 2, 4)+ "\n");
    	
    	Hypergeometric H = new Hypergeometric();
    	System.out.println("Hypergeometric:");
    	System.out.println(H.Hyper(20,5,6,4)+ "\n");
    	
    	Geometric G = new Geometric();
    	System.out.println("Geometric:");
    	System.out.println(G.Geo(.45, .55, 3)+ "\n");
    }
}