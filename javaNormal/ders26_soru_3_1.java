package javaNormal;

import java.util.Scanner;

public class ders26_soru_3_1 {

	public static void main(String[] args) {
		//  3X3 bir matris tan�mlayarak i�ini kullan�c�dan ald���n�z de�erlerle doldurunuz?
		int[][] m = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Matris verilerini giriniz");
		
		int i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("Sat�r="+i+"  S�tun="+j);
				m[i][j]=scan.nextInt();
			}
		}
		
		System.out.println();
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		}
		
		
	}

}
