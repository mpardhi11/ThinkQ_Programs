package video_Day_8;

public class ABSumc {

	public static void main(String[] args) {
		int[][] a= {{2,4},{3,3}};
		int[][] b= {{3,3},{4,3}};
		int[][] c= new int [2][2];
		
		System.out.println("=====================");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("=====================");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("=====================");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("=====================");

	}

}
