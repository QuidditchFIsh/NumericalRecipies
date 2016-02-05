package matricies;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] test = {{0,1,2},{3,4,5},{6,7,8}};
		MyMatrix test1 = new MyMatrix(3, 3);
		test1.setElements(test);
		test1.printout();
		System.out.println(test1.determinant(test1));
		
		
		
		
		

	}

}
