package javaNormal;

import java.util.ArrayList;

public class ders47_soru7_1 {

	public static void main(String[] args) {
		//  �ki ayr� s�n�f (2 java dosyas�) olu�turunuz. Bir tanesinde main method bulunsun,
		// di�erinde ise 2 adet method bulunsun, 
		// ilk method istenen say�da ve say� arala��nda rastgle say�lar �retip arrayList return etsin,
		// ikinci method ise istenen say�da ve istenen uzunlukta rastgele string �retip arraylist return etsin.
		Ureten u = new Ureten();		
		ArrayList<Integer> sl = u.sayiListesi(10, 20, 10);
		System.out.println(sl);
		
		ArrayList<String> str = u.stringListesi(3, 20);
		System.out.println(str);
	
	}

}
