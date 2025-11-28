package SortingSelection;
import java.util.Scanner;

public class SortingSelection {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int[] angka = new int[5];
		
		System.out.println("Masukkan 5 Angka:");
		for(int i = 0; i < 5; i++) {
		angka[i] = input.nextInt();
		}
		
		for(int i = 0; i < angka.length - 1; i++) {
			int maxIndex = i;
			
			for(int j = i + 1; j < angka.length; j++) {
				if(angka[j] > angka[maxIndex]) {
					maxIndex = j;
				}
			}
			
			int temp = angka[i];
			angka[i] = angka[maxIndex];
			angka[maxIndex] = temp;
			
			System.out.println("\nHasilnya : ");
			for(int a : angka) {
				System.out.print(a + " ");
			}
			
		}
	}
}
