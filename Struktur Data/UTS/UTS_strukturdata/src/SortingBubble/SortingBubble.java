package SortingBubble;
import java.util.Scanner;


public class SortingBubble {
	public static void main(String[] arg) {
	Scanner input = new Scanner(System.in);
	
	int[] angka = new int[5];
	
	System.out.println("Masukkan 5 Angka:");
	for(int i = 0; i < 5; i++) {
	angka[i] = input.nextInt();
	}
	
	for(int i=0; i < angka.length -1 ; i++) {
		for(int j= 0; j < angka.length - 1 - i; j++) {
			if(angka[j] < angka[j + 1]) {
				int temp = angka [j];
				angka[j] = angka [j + 1];
				angka[j + 1] = temp;
				
				System.out.println("\nHasilnya : ");
				for(int a : angka) {
					System.out.print(a + " ");
				}
			}
		}
	}
	
	}
}
