package function;
  /**
   * Takes the equation from the equation class and inputs 0-(q-1) where q it the value set by the user. 
   * it writes these values into a csv file
   * 
   * @author Stephen Murphy Jr
   */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter; 

public class plotter {
	public void plot(int q) {
		equation eq = new equation();
		try{
            FileWriter w = new FileWriter("eqouts.csv");        
            for(int i=0;i<q;i++){ 
             w.write(i+","+eq.Eq(i)+"\n");//writes x inputs/ y-values into a .csv file using the equation class
            }
            w.close();
		}catch(FileNotFoundException e){
            System.out.println("File Not Found");
		}catch(IOException e){
            System.out.println("ERROR");
		}    
	}
}
