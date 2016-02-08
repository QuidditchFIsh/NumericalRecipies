package matricies;
import java.util.Random;
import java.lang.Math;
public class inverseCumlativeMethod 
{
	//This class outputs a random number bound by a function only using one generated random number.
	public static double next(tau);
	{
		// here using range [-4,4]
		double y =0,a=4,b=-4;
		Random rand = new Random();
		y = rand.nextDouble();
		//create new random number in range [0,1]
		y= ( 1- exp(-b/tau)) * y;
		// convert it into range [0,g(b)]
		return (-tau * ln(1-y));
		//perform inverse function on it return 
	}

}
