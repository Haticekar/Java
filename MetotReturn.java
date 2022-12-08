package youtube;

public class MetotReturn {

	public static void main(String[] args) {
		mesajVer("Cihangir");
		
		System.out.println(topla(13,37));
		
		System.out.println(yuzdeOnHesapla(10,45));
		
		
	}
	
	
	public static void mesajVer(String name) {
		System.out.println("Merhaba" + " "+ name);
	}
	public static int topla(int sayi1,int sayi2) {
		int toplam=sayi1+sayi2;
		return toplam;
	}
	
	public static double yuzdeOnHesapla(int sayi3,int sayi4) {
		int toplam=topla(sayi3,sayi4);
		double sonuc=toplam*(10/100);
		return sonuc;
		
		
	}
	

}
