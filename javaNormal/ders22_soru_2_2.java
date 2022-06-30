package javaNormal;

import java.util.Random;

public class ders22_soru_2_2 {

	public static void main(String[] args) {
		// D�rt basamakl� rastgele 20 adet say� �retip bir diziye aktar�n�z, 3'e tam b�l�nenlerin toplam�ndan, 4'e tam b�l�nenlerin toplam�n� ��kart�n�z.
		int[] dizi = new int[20];
		Random r = new Random();
		int sayi = 0;
		int us,ut,ds,dt;
		us=ut=ds=dt=0;
		
		for(int i=0;i<20;i++) {
			sayi = r.nextInt(9000)+1000; //1000 ile 9999
			dizi[i]=sayi;
			System.out.print(dizi[i]+"-");
			if(dizi[i]%3==0) {
				us++;
				ut += dizi[i];
			}
			if(dizi[i]%4==0) {
				ds++;
				dt += dizi[i];
			}
		}
	
		System.out.println();
		System.out.println("��e b�l�nen say� adeti="+us);
		System.out.println("��e b�l�nen say� toplam�="+ut);
		System.out.println("D�rde b�l�nen say� adeti="+ds);
		System.out.println("D�rde b�l�nen say� toplam�="+dt);
		System.out.println("Farklar� ="+ (ut-dt));
		
	}

}
