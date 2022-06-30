package javaNormal;

abstract class SoyutSinif{
	abstract void soyutMethod(); //// soyut i�erisinde en az bir tane soyut method olmal�d�r
	
	void yaz() {  // soyut s�n�f i�erinde somut methodlar olabilir
		System.out.println("Soyut s�n�f i�inden yazd�r�ld�m");
	}
	
	public SoyutSinif() { // contructer tanmlanabilir
		// TODO Auto-generated constructor stub
	}
	
}


class Somutsinif extends SoyutSinif{
	void soyutMethod() { // e�er miras al�nm��sa soyut method mutlaka override edilmelidir
		System.out.println("ben somut i�inden override edildim");
	}
}


public class ders57_abstract {

	public static void main(String[] args) {
		// abstract - soyut s�n�f
		// soyut s�n�f�n nesnesi �retilemez
		// soyut i�erisinde en az bir tane soyut method olmal�d�r
		// soyut s�n�f i�erinde somut methodlar olabilir
		// contructer tanmlanabilir
		
		Somutsinif ss = new Somutsinif();
		ss.soyutMethod();
		ss.yaz();
		

	}

}
