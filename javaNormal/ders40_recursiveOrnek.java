package javaNormal;

import java.util.Scanner;

public class ders40_recursiveOrnek {
	
	static int topla(int bas,int bitis) {
		if(bitis>bas) {
		return bitis + topla(bas,bitis-1);
		} else return bitis;
	}

	public static void main(String[] args) {
		// Say� aral��� toplama - recursive
		int bas,bitis;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�eri :");
		bas = scan.nextInt();
		System.out.println("Biti� de�eri :");
		bitis = scan.nextInt();
		
		System.out.println(topla(bas, bitis));

	}

}
