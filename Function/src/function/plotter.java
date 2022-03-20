package function;
  
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
