package youtube;

public class StackHeap {

	public static void main(String[] args) {
		String[] sehirler1=new String[] {"Ankara","İstanbul","İzmir"};
		
		sehirler1=new String[4];
		sehirler1[3]="Bursa";
		System.out.println(sehirler1[1]); 
		//BU İFADE NULL DÖNER ÇÜNKÜ SEHİRLER1 YENİ BİR İÇİN HEAP DE YENİ BİR REFERANS OLUŞTU VE 0-1-2 ELEMANLARI HEPSİ NULL
		// SADECE 3. ELEMAN BURSA OLARAK KALIR.
		

	}

}
