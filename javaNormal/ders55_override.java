package javaNormal;

class Anasinif{
	void yaz() {
		System.out.println("Superclass'taki yaz metotundan");
	}
}

class Altsinif extends Anasinif{
	void yaz() {
		System.out.println("Alts�n�fta override edilen methodtan");
	}
}

public class ders55_override {

	public static void main(String[] args) {
		// override miras al�nan s�n�ftaki bir methodun iptal edilmesidir
		// @overrited
		Altsinif as = new Altsinif();
		as.yaz();

	}

}
