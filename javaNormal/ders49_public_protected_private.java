package javaNormal;

class Degiskenler{
	int a; //no midifier
	public char b = '�';
	protected String c;
	private int sayi = 0;
	
	private void yaz() {
		System.out.println("Ben methodtan yaz�ld�m");
	}
	
}


public class ders49_public_protected_private {

	public static void main(String[] args) {
		Degiskenler deg = new Degiskenler();
		deg.a = 10;
		deg.b = 'v';
		deg.c = "ali";
		//deg.sayi = 5; �al��t�ramay�z
		//deg.yaz(); �al��t�ramay�z		

	}

}
