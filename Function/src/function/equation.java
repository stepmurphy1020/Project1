package function;
/**
 * sets the equation for the plotter and salter classes and returns the output after receiving the parameter by the user
 * 
 * @author Jr
 *
 */
public class equation {
	public double Eq(double a) {
		double b = 3*(Math.pow(a, 2))+ (2*a) -1; //equation used to get y-values, in this case: 3x^2 + 2x - 1
		return b;
	}
}
