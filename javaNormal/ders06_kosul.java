package javaNormal;

import java.util.Scanner;

public class ders06_kosul {

	public static void main(String[] args) {
		// kullan�c�dan 2 say� alal�m
		// b�y�k olan� bulal�m
		// e�it ise e�ittir
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("a say�s�n� giriniz");
		a = scan.nextInt();
		System.out.println("b say�s�n� giriniz");
		b = scan.nextInt();

		if(a>b) {
			System.out.println("a say�s� b�y�kt�r");
		} else if(b>a) {	
			System.out.println("b say�s� b�y�kt�r");
		} else {
			System.out.println("say�lar e�ittir");
		}
		
		
	}

}
