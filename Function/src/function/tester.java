package function;

public class tester {
	public static void main(String[] args) {
		plotter plot = new plotter();
		plot.plot(45); //outputs a .csv file called eqouts which are the x and y values of the current equation
		
		Salter S = new Salter(); 
		S.Salt(45,1); /*takes the y-values from the equation and adds or subtracts the value specified and puts them into
		an array for the smoother to change.
		*/
		Smoother SM = new Smoother();
		SM.smooth(45); //takes the y-values and averages the ones around them in order to get close to the original set of data
	}
}
