public class Array2D
{

	public static void main(String[] args)
	{
	
		printArray( generate2DArray( 16 ) );

	}
	
	public static void printDashes( int[][] a )
	{
		
		int numberDashesPerBox = 0;
		int longestNumber = a[a.length-1][a.length-1];
		
		while ( longestNumber > 0 )
		{
		
			longestNumber = longestNumber/10;
			numberDashesPerBox += 1;
		
		}
		
		numberDashesPerBox += 1;
		
		for ( int u = 0; u < a.length; u++ )
		{
		
			for( int r = 0; r < numberDashesPerBox; r++ )
			
				System.out.print( "_" );
		
		}
	
	}

	public static void printSpaces( int currentNumber, int lastNumber )
	{
	
		int currentNumberLength = 0;
		int lastNumberLength = 0;
	
		while ( currentNumber > 0 )
		{
		
			currentNumber = currentNumber/10;
			currentNumberLength += 1;
		
		}
		
		while ( lastNumber > 0 )
		{
		
			lastNumber = lastNumber/10;
			lastNumberLength += 1;
		
		}
		
		int difference = lastNumberLength - currentNumberLength;
		
		for ( int v = 0; v < difference; v++ )
		{
		
			System.out.print( " " );
		
		}
	
	}
	
	public static void printArray( int[][] a)
	{
	
		for( int g = 0; g < a.length; g++ )
		{
			
			printDashes( a );
			System.out.print( "_" );
			System.out.println( "" );
			System.out.print( "|" );
			
		
			for( int z = 0; z < a[g].length; z++ )
			{
			
				System.out.print( a[g][z] );
				printSpaces( a[g][z], a[a.length-1][a.length-1] );
				System.out.print( "|" );
				
			}
			
			System.out.println( "" );
		
		}
		
		printDashes( a );
		System.out.println( "_" );
		
	}

	public static int [][] generate2DArray( int n )
	{

		int [][] array2 = new int [n][n];
		int j = 1;
		
		for ( int c = 0; c < n; c++ )
		{
		
			for ( int d = 0; d < n; d++ )
			{
			
				array2[ c ][ d ] = j;
				j++;
			
			}
		
		}
		
		return array2;
		
	}

	public static int[][] staircase2D( int n )
	{
		//instantiate
		int[][] arr = new int[n][n];
		int num = 1;
		for( int i = 0; i < arr.length; i++ )
		{
		
			for( int j = 0; j < arr[i].length; j++ )
			{
			
				arr[i][j] = num;
				num++;
				
			}
			
		}
		
		return arr;
		
	}

}