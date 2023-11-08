package Date021123;

public class Array2D {

	public static void main(String[] args) {
		
		// 1-D Array Initialization
		int[] a= {10, 20, 30, 40, 50};
		
		// 2-D Array 2 rows, 3 columns
		int[][] b= {{1, 2, 3},
					 {2, 3, 4}};
		
		// Printing 1-D Array elements
		System.out.println("1-D Array elements: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		// for-each loop - to iterate through all the elements in a collection
		System.out.println("Another way to print 1-D Array elements: ");
		for(int element:a)
		{
			System.out.println(element);
		}
		
		// displaying 2-d array
		System.out.println("2-D Array elements: ");
		for(int i=0; i<b.length; i++)     //rows
		{
			for(int j=0; j<b[i].length; j++ )     // columns
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
