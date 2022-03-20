package function;

import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Salter {
	public static ArrayList<Double> salt = new ArrayList<Double>();
	public void Salt(double q, double b) {
		Random roll = new Random();
		equation eq = new equation();
			try{
				FileWriter w = new FileWriter("salted.csv");        
				for(int t=0;t<q;t++){ 
					double[] change = {-b, b}; //sets an array that either subtracts or adds the amount specified
					int pick = roll.nextInt(2); // Chooses either -b or b from the change array
					w.write(t+","+ (eq.Eq(t)+ change[pick]) +"\n");
					//adds the y-value to the randomly chosen array value and writes it to salted.csv file
					salt.add(eq.Eq(t)+change[pick]); //adds to the salt array in order for it to be smoothed
				}
				w.close();
			}catch(FileNotFoundException e){
				System.out.println("File Not Found");
			}catch(IOException e){
            	System.out.println("ERROR");
			}
		}    
	}
