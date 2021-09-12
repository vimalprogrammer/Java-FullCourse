package projectj;

public class ArrayDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[][]={ {1,2,3},								//2D Array
//					{4,5,6},
//					{7,8,9} };
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++)
//				System.out.print(" "+a[i][j]);
//			System.out.println();
//		  }
		int a[][]={ {1,2,3},
				{4,5,6,6,8,9},
				{7,8} };									//<---Jagged Array
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++)
			System.out.print(" "+a[i][j]);
		System.out.println();
	  }
		
		
		 					
	}

}
