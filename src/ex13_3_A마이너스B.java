import java.util.Scanner;

public class ex13_3_A���̳ʽ�B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = 0;

		while (true) {

			System.out.print("A �Է� >> ");
			int A = sc.nextInt();
			System.out.print("B �Է� >> ");
			int B = sc.nextInt();

			if (A != 0 && B != 0) {
				min = A - B;
				System.out.println("��� >> " + min);
			} else {
				break;
			}

		}

	}

}
