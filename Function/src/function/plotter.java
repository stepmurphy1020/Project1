package function;
  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter; 

public class plotter {
	public void plot() {
		try{
            FileWriter w = new FileWriter("trial.csv");        
            for(int i=0;i<11;i++){ 
             w.write("\n"+i+","+i);
            }
            w.close();
		}catch(FileNotFoundException e){
            System.out.println("File Not Found");
		}catch(IOException e){
            System.out.println("ERROR");
     }    
	}
}
