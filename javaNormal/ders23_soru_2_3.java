package javaNormal;

public class ders23_soru_2_3 {

	public static void main(String[] args) {
		// Fibonacci serisinin ilk 30 eleman�n� bulup bir diziye aktar�n�z, her eleman� kendisinden �nceki elemana b�ld�rerek sonucun alt�n orana(~1,618) yakla�t���n� g�zlemleyiniz.
		int[] dizi = new int[30];
		int a,b,c;
		a = 0;
		b = 1;
		c = 0;
		
		for(int i=0;i<30;i++) {
			c = a + b;
			dizi[i]=c;
			System.out.print(dizi[i]+"-");
			a = b;
			b = c;
		}
		
		System.out.println("\n");
		for(int i=1;i<30;i++) {
			System.out.print(((float)dizi[i]/dizi[i-1]) + "  -  ");
		}
	
	}

}
