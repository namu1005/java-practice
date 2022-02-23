import java.util.Scanner;
public class ex12_3_입력받아별찍기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행개수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
