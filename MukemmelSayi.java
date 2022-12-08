package youtube;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int number=new Scanner(System.in).nextInt();
		
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}
			
		}
		if(total==number) {
			System.out.println("Number is perfect number");
			
		}else {
			System.out.println("Number isn't perfect number");
		}
		

	}

}
