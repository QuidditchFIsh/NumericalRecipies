package RandomNumbers;
import java.util.Random;
import java.lang.Math;
import java.io.*;
//This method will require you to know the maximum of a function over the range [a,b]
public class boxMethod
{
	//This method is for the gausian with mean 0 and standard deviation of 1.
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter output = new PrintWriter("output.txt","UTF-8");
		Random rand = new Random();
		double random1=0,random2=0;
		double a=-4,b=4,x1=0,y1=0,y2=0,fMax=2;
		for (int i=0; i<99;i++)
		{
			random1 = rand.nextDouble();
			//generate a random number in the range [0,1]
			x1 = a+ (b-a) *random1;
			// convert the random number into the range [a,b]
			y1= Math.exp(-1*Math.pow(x1,2)*0.5);
			// This generates random number for a gausian mean 0 and SD=1
			random2 = rand.nextDouble();
			// generates a new random number
			y2= y2* fMax;
			if( y2<y1)
			{
				//System.out.println(x1);
				output.printf("%10.8f \n",x1);
			}
			else
			{
				i--;
			}
			
			
		}
		output.close();
	}

	

}
