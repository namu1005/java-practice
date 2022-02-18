import java.util.Scanner;
public class ex15_2_각자리수의합 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[8];
		
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			
		}
		sum += num%10;
		
		System.out.println("합은 " + sum + "입니다.");
		
	}

}
