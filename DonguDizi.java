package youtube;

public class DonguDizi {

	public static void main(String[] args) {
		String[] sehirler=new String[]{"Ankara","İstanbul","İzmir"};
		for(String sehir:sehirler) {
			System.out.println(sehir);   //FOR-EACH DONGUSU
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(sehirler[i]); //FOR DONGUSU
		}
	}

}
