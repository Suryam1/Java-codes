package arrays_two_d;

public class SumofMiddleBorderClass {

	public SumofMiddleBorderClass() {
		// TODO Auto-generated constructor stub
		int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int row=5/2;
		int col=5/2;
		int middleElement=arr[row][col];
		int sum=0;
		for(int i=row-1;i<=row+1;i++) {
			for(int j=col-1;j<=col+1;j++) {
				sum+=arr[i][j];
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sum-=middleElement;
		System.out.println("Sum of middle border elements are : "+sum);
	}

}
