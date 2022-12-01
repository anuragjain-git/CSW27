import java.util.*;
public class sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x[][]= {{4,5,3,8,2,6,1,9,7},{8,9,2,5,7,1,6,3,4},{1,6,7,4,9,3,5,2,8},{7,1,4,9,5,2,8,6,3},{5,8,6,1,3,7,2,4,9},{3,2,9,6,8,4,7,5,1},{9,3,5,2,1,8,4,7,6},{6,7,1,3,4,5,9,8,2},{2,4,8,7,6,9,3,1,5}};
		boolean c = true;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				for(int k=1;k<9;k++) {
//					if(x[j][i]!=x[k][i]) {
//						c=false;
//					}
//					
//						
//				}
//			}
//		}
//		System.out.println(c);
	}

}
