package javaNormal;

final class Durum {
	final float pisayisi = (float) 3.14;
}

/*class Yenidurum extends Durum{ //final s�n�f miras vermez
	
} */

class Hesapla{
	final void ivme() {
		//v=at^2
	}
}

/*class YeniHesap extends Hesapla{
	void ivme() {   // superclass taki ivme metodu override edilemez
					// ivme hesaplama y�ntemini kilitlyoruz
	}
}*/

public class ders56_final_terimi {

	public static void main(String[] args) {
		// Final terimi bir niteli�in en son halini temsil
		// final olarak tan�nlanan bir s�n�f�n alts�n�f� olu�turulamaz
		// final olarak olu�tuluan method ise override edilemez
		// final olarak de�i�ken olu�turduysan�z de�er bir kere atanabilir ve de�i�tirilemez
		Durum d = new Durum();
		// d.pisayisi=3; pisay�s�na yeni bir de�er atamn�z� engeller
	}

}
