import java.util.Scanner;
public class ex13_2_�Է¹޾ƿ��ﰢ������� {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("�� ���� : ");
		int num = sc.nextInt();
		
		for (int a = 0; a < num; a++) {
			for (int i = a; i < num; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
