package javaNormal;

import java.util.Scanner;

public class ders07_kosul2 {

	public static void main(String[] args) {
		// V�cut kitle endeksi
		// index = kilo/(boy*boy) 
		// boy de�eri metre
		// index <20 zay�f
		// 20<index<25 ise normal
		// index>25
		
		float boy,kilo,index;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz");
		kilo = scan.nextFloat();
		System.out.println("Boyunuzu giriniz (m)");
		boy = scan.nextFloat();
		
		index = kilo / (boy*boy);
		System.out.println("V�cut kitle endeksiniz = "+ index);
		
		if(index<20) {
			System.out.println("Zay�fs�n�z!");
		} else if(index>=20 && index<25) {  // AND = &&
			System.out.println("Normal");
		} else {
			System.out.println("Kilolusunuz!");
		}
		

	}

}
