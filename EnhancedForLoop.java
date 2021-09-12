package projectj;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={ {1,2,3},
				{4,5,6,6,8,9},
				{7,8} };									//<---Jagged Array
	for(int b[] : a) {
		for(int c : b)
		System.out.print(c+" ");
	System.out.println();	
	}
	}

}
