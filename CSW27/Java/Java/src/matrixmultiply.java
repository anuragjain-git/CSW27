import java.util.Scanner;
public class matrixmultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter row and column for first matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.print("Enter row and column for second matrix: ");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		if(col!=row2) {
			System.out.println("Invalid Error");
		}
		
		int[][]a = new int[row][col];
		int[][]b = new int[row2][col2];
//		int[][]c = new int[row][col2];
		
		System.out.println("Enter First Matrix:");
		for(int i=0;i<row;i++) {
			System.out.print("Enter row "+(i+1) +": ");
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for(int i=0;i<col;i++) {
			System.out.print("Enter row "+(i+1) +": ");
			for(int j=0;j<col2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col2;j++) {
				int res=0;
				for(int k=0;k<col;k++) {
					res+=a[i][k]*b[k][j];
				}
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
}