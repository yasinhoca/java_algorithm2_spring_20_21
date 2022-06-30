package javaNormal;

public class ders33_methodlar {
	
	// bu metot de�er d�nd�rmez, de�er almaz
	// de�er d�nd�rmeyen metotlar void �nekini al�rlar
	static void yaz() {
		System.out.println("Ben metot taraf�ndan yazd�r�ld�m!");
	}
	
	// de�er d�nd�rmeyen de�er alan metotlar
	static void hosgeldin(String isim) {
		System.out.println("Ho�geldin "+ isim);
	}
	
	//de�er alan ve de�er d�nd�ren methodlar
	// de�er d�nd�ren metotlarda void yaz�lmaz, d�nd�rece�i de�erin tipi yaz�l�r
	static int topla(int a,int b) {
		return a + b;
	}

	
	public static void main(String[] args) {
		// Method - Metot
		//fonksiyonlar�n ayn�s�
		//her java dosyas� bir s�n�f-class dosyas�d�r
		//bu dosyalar main method ile ba�lar
		// main den ba�ka methodlar yaz�labir.
		yaz();
		hosgeldin("Alper");
		System.out.println(topla(45, 34));
	}

}
