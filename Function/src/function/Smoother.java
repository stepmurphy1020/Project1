package function;
/**
 * The smoother takes the array list made by the salter and averages the two values around a y-value and writes that in as its
 * new values, it does not go outside of the bounds set by the user.
 * 
 * 
 * 
 * @author Stephen Murphy Jr
 * 
 * 
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Smoother {
	public void smooth(double q) {
		Salter s = new Salter();      
		try{
			FileWriter w = new FileWriter("smoothed.csv"); //makes a new file called smooth.csv
			for(int i=0;i<q;i++){ 
				int p = i-1;//takes the value before the current y value
				int n = i+1;// takes the value after the current y value
				if(p>=0){   
					if(n<=(q-1)) { //doesn't exceed the bounds of the list of numbers
						double h = s.salt.get(p); //calls to the salt ArrayList and graves the value at index p
						double j = s.salt.get(n); //calls to the salt ArrayList and graves the value at index p
						double k = (((h+j)/2)); //averages the two points to give the value at the point between them 
						w.write(i+","+ k +"\n"); //writes to the smooth.csv file
				}
			}		
		} 
			w.close(); 
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException e){
        	System.out.println("ERROR");
		}
	}
}
