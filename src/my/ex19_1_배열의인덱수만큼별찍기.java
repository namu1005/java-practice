package my;
import java.util.Scanner;
public class ex19_1_�迭���ε�����ŭ����� {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+"��° ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for (int a = 0; a < arr[i]; a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
