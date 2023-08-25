package arrays_two_d;

public class MiddleElementClass {
	public MiddleElementClass() {
		int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Middle element is "+arr[5/2][5/2]);
	}
}
