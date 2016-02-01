package RandomNumbers;

public class monteCarloIntergration 
{
	public double average (double N)
	{
		double sum =0;
		for ( int i=0; i<N; i++)
		{
			sum += gausianPDF.next();
		}
		return sum/N;
	}
	public double intergrateGausian()
	{
		return gausianPDF.b-gausianPDF.a *  
	}
}
