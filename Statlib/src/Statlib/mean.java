package Statlib;

public class mean{
    public double mean(double[] numbers){
    if (numbers.length==0){
    return 0;}
    double temp =0;
    for(int i=0; i<numbers.length;i++){
    temp=temp+numbers[i];
    }
    return temp/numbers.length;
    }
}