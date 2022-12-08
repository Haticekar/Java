package youtube;

public class Workshop {

	public static void main(String[] args) {
		int[] sayilar=new int[] {30,25,21,12,8,45,1,2,55};
		int aranacak=0;
		boolean varMi=sayiBul(sayilar,aranacak);
		mesajVer(varMi,aranacak);
		
	}
	
	public static void mesajVer(boolean varMi,int aranacak) {
		String mesaj="";
		if(varMi) { // DEFAULT DURUMU TRUE DUR.
			mesaj="Sayi mevcuttur "+ aranacak;
			System.out.println(mesaj);
			
			
		}
		else {
			mesaj="Sayi mevcut degildir." +aranacak;
			System.out.println(mesaj);
			
			
		}
		
	}
	public static boolean sayiBul(int[] sayilar,int aranacak) {
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
				
			}
		}
		return varMi;
		
		
	}

}

//BIR FONKSIYON YAZ -- BOOL DONDURSUN-SAYIBUL
// IKI PARAMETRE ALSIN 

