package youtube;

public class Dizi {

	public static void main(String[] args) {
		double[] dizi=new double[] {1.2,5.6,8.9,34,52.13};
		double toplam=0;
		double max=dizi[0];
		
		for (double sayi:dizi) {
			toplam=toplam+sayi;
			if(sayi>max) {
				max=sayi;
			}
			
		}
		System.out.println("Toplam: " +toplam);
		System.out.println("Max: " +max);
	}

}
