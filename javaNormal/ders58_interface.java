package javaNormal;

interface ogrenci1{
	public void ogrenciNumaras�();
	public void ogrenciAdres();
}

class ogrenciSinif implements ogrenci1{
	public void ogrenciNumaras�() {
		// yap�lacak i�ler
	}

	@Override
	public void ogrenciAdres() {
		// TODO Auto-generated method stub
		
	}	
}

public class ders58_interface {

	public static void main(String[] args) {
		// interface normal s�n�f gibi tan�mlan�r
		ogrenciSinif os = new ogrenciSinif();
		os.ogrenciNumaras�();
	}

}
