package javaNormal;

public class ders43_soru_6_3 {
	static int kuvvetAl(int taban,int us) {
		int sonuc=1;
		for(int i=0;i<us;i++) sonuc *= taban;
		return sonuc;
	}

	public static void main(String[] args) {
		// Kendisine g�nderilen say� ve �s de�erlerine g�re kuvvet alan methodu yaz�n�z? (Math.Pow() fonksiyonunu yazacaks�n�z k�saca)
		System.out.println(kuvvetAl(5,3));
	}

}
