package javaNormal;

public class ders15_soru1_3 {

	public static void main(String[] args) {
		// 50 ile 250 aras�ndaki �ift say�lar�n toplam�n� bulunuz?
		int toplam = 0;
		
		for(int i=50;i<250;i++) {
			if(i%2==0) {
				toplam+=i;
			}
		}
		
		System.out.println("�ift say�lar�n toplam�="+toplam);
		

	}

}
