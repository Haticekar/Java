package youtube;

public class StackHeap2 {

	public static void main(String[] args) {
		String[] sehirler1=new String[] {"Ankara","İzmir","İstanbul"};
		String[] sehirler2=new String[] {"Mersin","Adana","Ordu"};
		
		sehirler1=sehirler2;
		sehirler1[0]="Bursa";
		System.out.println(sehirler2[0]);
// SONUC BURSA OLUR ÇUNKU BİRBİRİNE EŞİTLEDİĞİMİZ ZAMANDA İKİSİ DE HEAP DE AYNI REFERANS NUMARASINI GÖSTERİYOR.
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=30;
		System.out.println(sayi1);
		
		// VALUE TYPES=BOOL,INT,DOUBLE,FLOAT..
		//REFERENCE TYPES=ARRAY,CLASS,ABSTRACT,İNTERFACE...;
		// VALUE TYPES SADECE STACK DE OLUŞUR HEAP İLE İLGİLİ BİR ŞEY OLMAZ.
		
	}

}
