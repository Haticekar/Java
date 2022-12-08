package youtube;

import java.util.Scanner;

public class AsalSayiBulma {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int number=new Scanner(System.in).nextInt();
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("Number isn't prime");
			return;
			
		}
		if(number<1) {
			System.out.println("Invalid number ");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==false) {
			System.out.println("Number isn't prime");
		}else {
			System.out.println("Number is prime");
		}
	}

}
