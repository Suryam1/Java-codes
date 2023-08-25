package arrays_two_d;

public class SumOfCornerElementsClass {

	public SumOfCornerElementsClass() {
		// TODO Auto-generated constructor stub
		int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int sum=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||i==4) {
					sum+=arr[i][j];
				}
				else if(j==0||j==4) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum of all border elements are : "+sum);
	}

}
