import java.util.Scanner;
public class ex15_1_n��°�ױ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int num = sc.nextInt();
		
		int n = 1;
		
		for (int i = 0; i < num; i++) {
			n+=i;
			System.out.print(n + " ");
		}
	}
}
