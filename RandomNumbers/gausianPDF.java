package RandomNumbers;

import java.util.Random;

public class gausianPDF 
{
	private double mean,width;
	static double a=4,b=4;
	
	
	public gausianPDF(double mean, double width)
	{
		this.mean = mean;
		this.width=width;
	}
	public static double next()
	{
		Random rand = new Random();
		double random1=0;
		double x1=0,y1=0,y2=0,fMax=2;
		while(y2>y1)
		{
			
			random1 = rand.nextDouble();
			//generate a random number in the range [0,1]
			x1 = a+ (b-a) *random1;
			// convert the random number into the range [a,b]
			y1= evaluategausian(x1);
			// This generates random number for a gausian mean 0 and SD=1
			y2 = rand.nextDouble();
			// generates a new random number
			y2= y2* fMax;
			
		}
		return x1;
	}
	
	public static double evaluategausian(double x)
	{
		return Math.exp((-1*Math.pow(x-mean,2))/(2* Math.pow(width, 2)));
	}
}
