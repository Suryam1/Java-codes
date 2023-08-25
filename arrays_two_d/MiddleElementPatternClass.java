package arrays_two_d;

public class MiddleElementPatternClass {

	public MiddleElementPatternClass() {
		// TODO Auto-generated constructor stub
		int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int middleElement=arr[5/2][5/2];
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					arr[i][j]=middleElement;
				}
				if(i+j==4) {
					arr[i][j]=middleElement;
				}
			}
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
