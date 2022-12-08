package youtube;

import java.util.Scanner;

public class ArkadasSayi {

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int number1=new Scanner(System.in).nextInt();
		
		System.out.println("Enter the second number: ");
		int number2=new Scanner(System.in).nextInt();
		
		int total1=0;
		int total2=0;
		
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				total1+=i;
				
			}
		}
		
		for(int i=1;i<number2;i++) {
			if(number2%i==0) {
				total2+=i;
				
			}
		}
		
		if(number1==total2 && number2==total1) {
			System.out.println("Arkadas sayidir.");
		}else {
			System.out.println("Arkadas sayi degildir.");
		}


	}

}
