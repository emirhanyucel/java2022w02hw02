package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		
		krediUI.KrediHesapla(new AskerKrediManager());
		
		krediUI.KrediHesapla(new AskerKrediManager()); //Üçü de oluyor, çünkü hepsi BaseKrediManager'dan inherit alıyor. 
		// Sonradan başka bir kredi türü eklersek de bunu sisteme dahil edebiliriz. Buna polymorphism denir.

	}

}
