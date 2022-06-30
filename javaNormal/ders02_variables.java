package javaNormal;

public class ders02_variables {

	public static void main(String[] args) {
		// Tek sat�rl�k a��klama 
		/* �ok
		 * sat�rl�
		 * a��klama
		 */
		
		//Variables - De�i�kenler
		int a = 5; //bu direk olu�tururken de�er atad�m
		a = 7; //daha sonra da atama yap�labilir
		
		int b;
		b = a + 5; //b ka� olur? 
		//int = integer = tam say� demektir. 4 byte alan kaplar
		//2^32 -1 kadar de�er
		//negatif de�er de al�r
		int c;
		c = a-b; // -5
		System.out.println(c);
		
		//byte -127 ile +127 aras� 
		byte d = 34;
		//d = 245; aral�k d���nda tan�mlama yap�lamaz
		
		//short 32768 ile -32768
		short e = -130;
		
		//long 2^64
		long f = 356788883;
		
		//float noktal� say�lar
		float g = (float) 3.14; //casting 
		
		//double 2^64 noktal� say�lar
		double h = 6.89765432;
		
		//boolean true - false
		boolean durum = false;
		System.out.println(durum);
		
		// char karakter de�i�kenler
		char i = 'k';
		System.out.println("Karakter = " + i);
		System.out.println((char)64);
		System.out.println((int)'@');
		
		//String
		// String s�n�f� primitive de�ildir
		String s ="Algoritma dersini";
		s = s + " �ok seviyorum";
		System.out.println(s);
		
		int k,l,m;
		k = l = m = 5;
		System.out.println(k+l+m);
		System.out.println(Integer.toString(k)+ Integer.toString(l)+ Integer.toString(m) );
		//Integer.toString(sayi) -> say�y� stringe �evirir
		System.out.println((float)k); //casting d�n���m
		
	}

}
