import java.util.Scanner;

public class ex13_3_A마이너스B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = 0;

		while (true) {

			System.out.print("A 입력 >> ");
			int A = sc.nextInt();
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();

			if (A != 0 && B != 0) {
				min = A - B;
				System.out.println("결과 >> " + min);
			} else {
				break;
			}

		}

	}

}
