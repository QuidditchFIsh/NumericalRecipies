/*Author: Nye Baker
 * A class which will have the functionality of a matrix.
 * 
*/

package matricies;
import java.util.*;
import java.io.*;

public class MyMatrix 
{

double[][] matrix;

public MyMatrix( MyMatrix A)
{
	matrix= A.matrix;
	//A copy constructor.
}

public MyMatrix(int m, int n)
{	
	matrix = new double[m][n];
}
public MyMatrix readScaner( Scanner input)
{
	// This method will create a matrix according to an input file of a form specified in README
	MyMatrix A = new MyMatrix(input.nextInt(),input.nextInt());
	for (int i=0;i<A.matrix.length;i++)
		for(int j=0;j<A.matrix[0].length;j++)
		{
			A.matrix[i][j] = input.nextDouble();
		}
	return A;
	
}

public void setElements(int x, int y, double val )
{
	matrix[x][y] = val;
	//A method to set the elements of a matrix to a specific value.
}
public void setElements(int[][] matrix)
{
	for (int i=0; i<matrix.length;i++)
		for(int j=0; j<matrix[0].length;j++)
		{
			this.matrix[i][j] = matrix[i][j];
		}
	// A method to take in an array and create a matrix.
}
public void setElements(double[] column)
{
	if (column.length == this.matrix.length * this.matrix[0].length)
	{
		int k=0;
		for( int i=0;i<matrix.length;i++)
			for (int j=0;j<matrix[0].length;j++)
			{
				matrix[i][j]=column[k];
				k++;
			}
		
		
	}
		
}

public double getElements(int x, int y)
{
	return matrix[x][y];
	//A method to return the value of a particular element of the matrix.
}

public MyMatrix add(MyMatrix A, MyMatrix B)
{
	MyMatrix C = new MyMatrix(A.matrix.length,A.matrix[0].length);
	if (canAdd(A,B))
	{
		
		for (int i=0; i<A.matrix.length;i++)
			for (int j=0;j<A.matrix[0].length;j++)
			{
				C.setElements(i,j,A.matrix[i][j] + B.matrix[i][j]);
			}
	}
	return C;
}
	/*
	else
	{
		System.out.println("These two Matricies can't be added dimensions incorrect");
	}
	//A method to add two matricies together provided that they are of the same dimensions.
	 * 
	 */

private boolean canAdd(MyMatrix A, MyMatrix B)
{
	if(A.matrix.length == B.matrix.length && A.matrix[0].length == B.matrix[0].length)
		return true;
	
	else
		return false;
	//A Method to test if 2 matrices can be added
}

public MyMatrix multiply(MyMatrix A, MyMatrix B)

{
	MyMatrix C = new MyMatrix(A.matrix.length,B.matrix[0].length);
	if(canMultiply(A,B))
	{
		
		for (int i=0;i<C.matrix.length;i++)
			for (int j=0;j<C.matrix[0].length;j++)
			{
				double sum =0;
				for (int k=0;k<A.matrix[0].length;k++)
					{
						sum += A.matrix[i][k] * B.matrix[k][j];
					}
				C.matrix[i][j] = sum;
			}
	}
	
	/*
	else 
	{
		System.out.println("The two matricies cannot be multiplied");
	}
	*/
	return C;
}

private boolean canMultiply(MyMatrix A, MyMatrix B)
{
	if (A.matrix.length == B.matrix[0].length)
		return true;
	else
		return false;
	//A method to test is 2 matrices can be multiplied 
}

public MyMatrix transpose(MyMatrix A)
{
	int temp = 0;
	for (int i=0;i<A.matrix.length;i++)
		for (int j=0;j<A.matrix[0].length;j++)
		{
			A.matrix[i][j]=temp;
			A.matrix[i][j]= A.matrix[j][i];
			A.matrix[j][i]=temp;
		}
	return A;
}
public double determinant(MyMatrix A)
{
	//Method to return the determinant of an nxn matrix by reducing it to a matrix of determinants. This method will only 
	//calculate the determinant of 2x2 matricies. For all others it will break them down into small matricies to calculate det
	//Try to find another way to do this as this is inefficent.
	if ( A.matrix.length == A.matrix[0].length)
	{
	if(A.matrix.length ==2 && A.matrix[0].length == 2)
	{
		//System.out.println((A.matrix[0][0] * A.matrix[1][1]) - (A.matrix[0][1] * A.matrix[1][0]));
		return (A.matrix[0][0] * A.matrix[1][1]) - (A.matrix[0][1] * A.matrix[1][0]);
	}
	else
	{
		double det=0;
		MyMatrix B = new MyMatrix(A.matrix.length-1,A.matrix[0].length-1);
		
		for (int i =0; i<A.matrix.length ; i++)
		{
			double[] column = new double[(A.matrix.length-1) * (A.matrix[0].length-1)];
			int c=0;
			for (int j=0;j<A.matrix.length;j++)
			{
				for (int k=0; k<A.matrix[0].length;k++)
				{
					if(j!= 0 && k!=i)
					{
						column[c]=A.matrix[j][k];
						c++;
					}
					
				}
			}
			B.setElements(column);
			B.printout();
			System.out.println();
			det += determinant(B)* Math.pow(-1, A.matrix[0][i])*A.matrix[0][i];
		}
		return det;
	}
	}
	else
	{
		return 0;
	}
}
public void printout()
{
	
	for(int i=0; i<matrix.length;i++)
	{
		
		for (int j=0; j<matrix[0].length;j++)
		{
			System.out.print(matrix[i][j] + " "); 
		}
		System.out.println();
		
	}
}

public MyMatrix inverse(MyMatrix A)
{
	// A method to calculate the inverse of a given matrix A. This will use the cofactor method so will make heavy use of 
	// the determinat method.FIND ANOTHER WAY TO DO THIS;.
	MyMatrix B = new MyMatrix(A.matrix.length,A.matrix[0].length);
	for(int i=0;i<A.matrix.length;i++)
		for ( int j=0;j<A.matrix[0].length;j++)
		{
			
		}
}
private MyMatrix coFactor(int m, int n)
{
	// A method to create the coFactor matrix for calculating the inverse of a matrix
}








}
