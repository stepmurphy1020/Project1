package Statlib;

public class StdDev{
    public double SD(double[] numbers)
  {
      if(numbers.length<=1){
        return 1;
        }
      if(numbers.length==0){
        return 0;
        }
      double mean = 0;
      for(int i=0;i<numbers.length;i++){
        mean=numbers[i]+mean;
        }
      mean=mean/numbers.length;
      double sumofvals=0;
      for(int i=0; i<numbers.length;i++){
        double vals=Math.pow(mean-numbers[i],2);
        sumofvals=sumofvals+vals;
        }
      double result = sumofvals/(numbers.length-1);
      return Math.sqrt(result);
  }
}