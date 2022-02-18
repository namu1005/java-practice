import java.util.Scanner;
public class ex12_3_입력받아별찍기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for (int a = 0; a < num; a++) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
