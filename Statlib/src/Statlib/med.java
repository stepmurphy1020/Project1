package Statlib;

import java.util.Arrays;
public class med
{ 
   public double median(double[] numbers){
    Arrays.sort(numbers);
    double median = 0;
    if(numbers.length % 2 == 0){ //checks for a remainder
        median = (numbers[(numbers.length/2)-1] +numbers[numbers.length/2])/2;
        //find the middle two numbers adds them and takes the average to find the "middle"
    }else{
        median = numbers[numbers.length/2]; //finds the middle value
    }
    return median;
    }
}