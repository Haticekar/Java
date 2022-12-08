package youtube;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.setName("Mouse");
		
		Product product2=new Product();
		product2.setName("Klavye");
		
		product1.getName();
		product2.getName();
		
		Product[] items=new Product[] {product1,product2};
		
		for(Product item:items) {
			System.out.println(item.getName());
		}
	}
	
	// PRODUCT CLASS I İLE BAĞLANTILI BÖLÜM
	

}
