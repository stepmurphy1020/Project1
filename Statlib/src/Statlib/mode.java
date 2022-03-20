package Statlib;

public class mode
{
  public double mode(double[] numbers){
    double most = 0; //sets the array to have no mode
    int Count = 0; //this is the count of how many times this number occurs
    for(int i=0; i<numbers.length;i++){
        int count = 0;
        for(int l=0; l<numbers.length;l++){ //compares numbers in the array to eachother for every number in the array
            if(numbers[l]==numbers[i]){
                count++; //adds to count 
            }
        }
        if(Count<count){
         Count=count; //sets the next highest count to the new highest
         most = numbers[i]; //sets the number that occurs the most to the Mode
        }
    }
    return most;
    }
}