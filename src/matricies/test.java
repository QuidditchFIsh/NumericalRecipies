package matricies;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] test = {{0,1,2},{4,5,6,}};
		MyMatrix test1 = new MyMatrix(test.length, test[0].length);
		test1.setElements(test);
		test1.printout();
		System.out.println(test1.determinant(test1));
		
		
		
		
		

	}

}
